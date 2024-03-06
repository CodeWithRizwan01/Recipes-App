package com.example.chickenrecipe.Fragments;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;


import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.example.chickenrecipe.Activities.DetailsActivity;
import com.example.chickenrecipe.Adapter.RecipesAdapter;
import com.example.chickenrecipe.DataList.DataList;
import com.example.chickenrecipe.DbHelper.DbHelper;
import com.example.chickenrecipe.Model.Data;
import com.example.chickenrecipe.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class RecipeFragment extends Fragment {

    SearchView searchViewExercise;
    RecyclerView recipeRecycler;
    RecipesAdapter adapter;
    ArrayList<Data> dataList;

    DbHelper dbHelper;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    AdRequest adRequest;
    private int addCounter = 0;

    public RecipeFragment() {
        // Required empty public constructor
    }

    @Override
    @SuppressLint("MissingInflatedId")
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_recipe, container, false);


        // Init Layout Views
        searchViewExercise = rootView.findViewById(R.id.searchViewRecipe);
        recipeRecycler = rootView.findViewById(R.id.recipeRecycler);
        dataList = new ArrayList<>();
        dbHelper = DbHelper.getInstance(getContext());

        // set data to the list of adapter
        DataList data = new DataList(getContext());
        dataList = data.getAllChickenRecipes();

        // set recycler view and adapter to it
        adapter = new RecipesAdapter(getContext(), dataList);
        recipeRecycler.setAdapter(adapter);
        recipeRecycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        // Ad request
        MobileAds.initialize(getContext());
        adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

        adapter.setOnItemClickListener(new RecipesAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                // show interstitial ad-ap-lovin
                loadInterstitialAd();
                if (addCounter == 1) {
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(getActivity());
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                // Next Content Activity
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("ListType", "All Chicken Recipes");
                intent.putExtra("Image", dataList.get(position).getRecipeImage());
                intent.putExtra("Title", dataList.get(position).getRecipeTitle());
                intent.putExtra("Time", dataList.get(position).getCockingTime());
                intent.putExtra("Calories", dataList.get(position).getCalories());
                intent.putExtra("Fats", dataList.get(position).getFats());
                intent.putExtra("Proteins", dataList.get(position).getProteins());
                intent.putExtra("Ingredients", dataList.get(position).getIngredients());
                intent.putExtra("Instruction", dataList.get(position).getInstructions());
                startActivity(intent);
            }
        });

        adapter.setOnFavoriteIconClickListener(new RecipesAdapter.onFavoriteIconClickListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onFavoriteIconClick(View view, int position) {
                Data listData = dataList.get(position);

                // check recipe if already exist (if added to favorite)
                boolean isFavorite = dbHelper.isDataExists(listData.getRecipeTitle());

                if (!isFavorite){
                    dbHelper.insertRecipe(position, listData.getRecipeTitle(), "All Weight Loss Recipe");
                    Toast.makeText(getContext(), "Added to Favorite", Toast.LENGTH_SHORT).show();
                    adapter.notifyDataSetChanged();
                } else {
                    dbHelper.deleteRecipe(listData.getRecipeTitle());
                    Toast.makeText(getContext(), "Remove from Favorite", Toast.LENGTH_SHORT).show();
                    adapter.notifyDataSetChanged();
                }

                adapter.notifyDataSetChanged();

            }
        });

        searchViewExercise.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });


        return rootView;
    }

    void filter(String newText){
        ArrayList<Data> filteredList = new ArrayList<>();
        for (Data data : dataList){
            if (data.getRecipeTitle().toLowerCase().contains(newText.toLowerCase())){
                filteredList.add(data);
            }
        }
        adapter.filterList(filteredList);
    }

    void loadInterstitialAd(){
        InterstitialAd.load(getContext(),"ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });
    }

}
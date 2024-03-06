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
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.example.chickenrecipe.Activities.DetailsActivity;
import com.example.chickenrecipe.Activities.RecipesActivity;
import com.example.chickenrecipe.Adapter.RecipesAdapter;
import com.example.chickenrecipe.DataList.DataList;
import com.example.chickenrecipe.DbHelper.DbHelper;
import com.example.chickenrecipe.Model.Data;
import com.example.chickenrecipe.Model.Favorite;
import com.example.chickenrecipe.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FavoriteFragment extends Fragment {

    RecyclerView favoriteRecycler;
    RecipesAdapter adapter;
    ArrayList<Data> dataList;
    TextView tvEmptyListTitle;

    DataList data;
    DbHelper dbHelper;

    private InterstitialAd mInterstitialAd;
    AdRequest adRequest;
    private int addCounter = 0;

    public FavoriteFragment() {
        // Required empty public constructor
    }

    @Override
    @SuppressLint("MissingInflatedId")
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);

        MobileAds.initialize(getContext());
        adRequest = new AdRequest.Builder().build();


        // init layout views
        favoriteRecycler = rootView.findViewById(R.id.favoriteRecycler);
        tvEmptyListTitle = rootView.findViewById(R.id.tvEmptyListTitle);
        dataList = new ArrayList<>();
        data = new DataList(getContext());
        dbHelper = DbHelper.getInstance(getContext());

        // get data from SQLite table
        ArrayList<Favorite> recipeList = dbHelper.getAllRecipe();

        for (int i=0; i<recipeList.size(); i++){
            // get list type from SQLite data
            String listType = recipeList.get(i).getListType();

            // get data from list according to list type
            ArrayList<Data> list = data.getRecipeList(listType);

            // make data object according to position stored in SQLite
            Data data1 = list.get(recipeList.get(i).getPosition());

            // add data to the dataList to show in recycler view
            dataList.add(data1);
        }

        // set recycler view and adapter to it
        adapter = new RecipesAdapter(getContext(), dataList);
        favoriteRecycler.setAdapter(adapter);
        favoriteRecycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        // check if list is empty and show/hide empty text
        showEmptyTextIfListEmpty();

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
                intent.putExtra("ListType", "Weight Loss Recipe");
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
            @Override
            @SuppressLint("NotifyDataSetChanged")
            public void onFavoriteIconClick(View view, int position) {
                dbHelper.deleteRecipe(dataList.get(position).getRecipeTitle());
                dataList.remove(position);
                adapter.notifyItemRemoved(position);
                adapter.notifyDataSetChanged();

                // check if list is empty and show/hide empty text
                showEmptyTextIfListEmpty();
            }
        });

        return rootView;
    }

    void showEmptyTextIfListEmpty(){
        if (dataList.isEmpty()){
            tvEmptyListTitle.setVisibility(View.VISIBLE);
        } else {
            tvEmptyListTitle.setVisibility(View.GONE);
        }
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
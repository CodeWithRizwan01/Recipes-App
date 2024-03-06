package com.example.chickenrecipe.Activities;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;


import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
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

public class RecipesActivity extends AppCompatActivity {

    RecyclerView recipeRecycler;
    ArrayList<Data> dataList;
    DbHelper dbHelper;

    // For Banner Ad
    private AdView mAdView;

    // For Interstitial Ad-App-Lovin
    private InterstitialAd mInterstitialAd;
    AdRequest adRequest;
    private int retryAttempt;
    private int addCounter = 0;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        mAdView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        // Init Layout Views
        recipeRecycler = findViewById(R.id.recipeRecycler);
        dataList = new ArrayList<>();
        dbHelper = DbHelper.getInstance(this);

        // get data from intent
        String listType = getIntent().getStringExtra("ListType");

        // set custom tool bar
        Toolbar toolbar = findViewById(R.id.recipeToolBar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(listType);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // set data to the list of adapter
        DataList data = new DataList(this);
        if (listType != null){
            dataList = data.getRecipeList(listType);
        }

        // set recycler view and adapter to it
        RecipesAdapter adapter = new RecipesAdapter(this, dataList);
        recipeRecycler.setAdapter(adapter);
        recipeRecycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        adapter.setOnItemClickListener(new RecipesAdapter.onItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                // show interstitial ad-ap-lovin
                loadInterstitialAd();
                if (addCounter == 1) {
                    if (mInterstitialAd != null) {
                        mInterstitialAd.show(RecipesActivity.this);
                    }
                    addCounter = 0;
                } else {
                    addCounter++;
                }
                // Next Content Activity
                Intent intent = new Intent(RecipesActivity.this, DetailsActivity.class);
                intent.putExtra("ListType", listType);
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
                    dbHelper.insertRecipe(position, listData.getRecipeTitle(), listType);
                    Toast.makeText(RecipesActivity.this, "Added to Favorite", Toast.LENGTH_SHORT).show();
                    adapter.notifyDataSetChanged();
                } else {
                    dbHelper.deleteRecipe(listData.getRecipeTitle());
                    Toast.makeText(RecipesActivity.this, "Remove from Favorite", Toast.LENGTH_SHORT).show();
                    adapter.notifyDataSetChanged();
                }

                adapter.notifyDataSetChanged();

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    void loadInterstitialAd(){
        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
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
package com.example.chickenrecipe.Fragments;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.example.chickenrecipe.Activities.RecipesActivity;
import com.example.chickenrecipe.Adapter.MainRecipeAdapter;
import com.example.chickenrecipe.MainActivity;
import com.example.chickenrecipe.Model.MainRecipeModel;
import com.example.chickenrecipe.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HomeFragment extends Fragment {

    private InterstitialAd mInterstitialAd;
    AdRequest adRequest;
    private int addCounter = 0;
    //    Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayList<MainRecipeModel> models = new ArrayList<>();
    ImageView ivAsian, ivArabian, ivItalian, ivMexican, ivAllRecipe;

    public HomeFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = rootView.findViewById(R.id.recyclerView);
//        toolbar = rootView.findViewById(R.id.toolBar);
        ivAsian = rootView.findViewById(R.id.iv_asian);
        ivArabian = rootView.findViewById(R.id.iv_arabian);
        ivItalian = rootView.findViewById(R.id.iv_italian);
        ivMexican = rootView.findViewById(R.id.iv_mexican);
        ivAllRecipe = rootView.findViewById(R.id.iv_all_chicken);

        AppCompatActivity activity = (AppCompatActivity) getActivity();

        // Ad request
        MobileAds.initialize(getContext());
        adRequest = new AdRequest.Builder().build();

//        activity.setSupportActionBar(toolbar);

        models.add(new MainRecipeModel(R.drawable.cheesy, "Cheesy Chicken Recipes"));
        models.add(new MainRecipeModel(R.drawable.sweat, "Sweet Chicken Recipes"));
        models.add(new MainRecipeModel(R.drawable.kiev, "Chicken Kiev Recipes"));
        models.add(new MainRecipeModel(R.drawable.salsa, "Salsa Chicken Recipes"));
        models.add(new MainRecipeModel(R.drawable.spicy, "Spice Lover Recipes"));
        models.add(new MainRecipeModel(R.drawable.stuffed, "Stuffed Chicken Recipes"));

        MainRecipeAdapter adapter = new MainRecipeAdapter(getContext(), models);
        recyclerView.setAdapter(adapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);

        adapter.setOnItemClickListener(new MainRecipeAdapter.onItemClickListener() {
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
                goForRecipesActivity(models.get(position).getRecipeTitle());
            }
        });

        rootView.findViewById(R.id.cardViewHome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = getActivity();
                MainActivity mainActivity = (MainActivity) activity;
                mainActivity.openNavigationFragment(new RecipeFragment(), R.id.opt_recipe);
            }
        });

        ivAsian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                goForRecipesActivity("Asian Chicken Recipes");
            }
        });
        ivArabian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                goForRecipesActivity("Arabian Chicken Recipes");
            }
        });
        ivItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                goForRecipesActivity("Italian Chicken Recipes");
            }
        });
        ivMexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                goForRecipesActivity("Mexican Chicken Recipes");
            }
        });

        return rootView;

    }

    void goForRecipesActivity(String listType) {
        Intent intent = new Intent(getActivity(), RecipesActivity.class);
        intent.putExtra("ListType", listType);
        startActivity(intent);
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

// -----> Interstitial ad show method
//        createInterstitialAd();

//        CardView cardLowCalories = rootView.findViewById(R.id.cardLowCaloriesRecipes);
//        CardView cardLowVegan = rootView.findViewById(R.id.cardLowVeganRecipes);
//        CardView cardLowCarbs = rootView.findViewById(R.id.cardLowCarbsRecipes);
//        CardView cardHealthyDinner = rootView.findViewById(R.id.cardHealthyDinnerRecipes);
//        CardView cardHealthyChicken = rootView.findViewById(R.id.cardHealthyChickenRecipe);

//        cardLowCalories.setOnClickListener(v -> {
//            // show interstitial ad-ap-lovin
//            if (addCount == 1) {
//                if (interstitialAd.isReady()) {
//                    interstitialAd.showAd();
//                }
//                addCount = 0;
//            } else {
//                addCount++;
//            }
//            // Next Content Activity
//            goForRecipesActivity("Low Calories Recipes");
//        });
//        cardLowVegan.setOnClickListener(v -> {
//            // show interstitial ad-ap-lovin
//            if (addCount == 1) {
//                if (interstitialAd.isReady()) {
//                    interstitialAd.showAd();
//                }
//                addCount = 0;
//            } else {
//                addCount++;
//            }
//            // Next Content Activity
//            goForRecipesActivity("Low Vegan Recipes");
//        });
//        cardLowCarbs.setOnClickListener(v -> {
//            // show interstitial ad-ap-lovin
//            if (addCount == 1) {
//                if (interstitialAd.isReady()) {
//                    interstitialAd.showAd();
//                }
//                addCount = 0;
//            } else {
//                addCount++;
//            }
//            // Next Content Activity
//            goForRecipesActivity("Low Carbs Recipes");
//        });
//        cardHealthyDinner.setOnClickListener(v -> {
//            // show interstitial ad-ap-lovin
//            if (addCount == 1) {
//                if (interstitialAd.isReady()) {
//                    interstitialAd.showAd();
//                }
//                addCount = 0;
//            } else {
//                addCount++;
//            }
//            // Next Content Activity
//            goForRecipesActivity("Healthy Dinner Recipes");
//        });
//        cardHealthyChicken.setOnClickListener(v -> {
//            // show interstitial ad-ap-lovin
//            if (addCount == 1) {
//                if (interstitialAd.isReady()) {
//                    interstitialAd.showAd();
//                }
//                addCount = 0;
//            } else {
//                addCount++;
//            }
//            // Next Content Activity
//            goForRecipesActivity("Healthy Chicken Recipes");
//        });
//


//    }
//
//    void goForRecipesActivity(String listType) {
//        Intent intent = new Intent(getActivity(), RecipesActivity.class);
//        intent.putExtra("ListType", listType);
//        startActivity(intent);
//    }
//
//
//    // -----> Interstitial Ad-App-Lovin
//    void createInterstitialAd() {
//        interstitialAd = new MaxInterstitialAd(getString(R.string.interstitial_ad_id), getActivity());
//        interstitialAd.setListener(new MaxAdListener() {
//            // MAX Ad Listener
//            @Override
//            public void onAdLoaded(final MaxAd maxAd) {
//                // Interstitial ad is ready to be shown. interstitialAd.isReady() will now return 'true'
//                // Reset retry attempt
//                retryAttempt = 0;
//            }
//
//            @Override
//            public void onAdLoadFailed(final String adUnitId, final MaxError error) {
//                // Interstitial ad failed to load
//                // AppLovin recommends that you retry with exponentially higher delays up to a maximum delay (in this case 64 seconds)
//                retryAttempt++;
//                long delayMillis = TimeUnit.SECONDS.toMillis((long) Math.pow(2, Math.min(6, retryAttempt)));
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        interstitialAd.loadAd();
//                    }
//                }, delayMillis);
//            }
//
//            @Override
//            public void onAdDisplayFailed(final MaxAd maxAd, final MaxError error) {
//                // Interstitial ad failed to display. AppLovin recommends that you load the next ad.
//                interstitialAd.loadAd();
//            }
//
//            @Override
//            public void onAdDisplayed(final MaxAd maxAd) {
//            }
//
//            @Override
//            public void onAdClicked(final MaxAd maxAd) {
//            }
//
//            @Override
//            public void onAdHidden(final MaxAd maxAd) {
//                // Interstitial ad is hidden. Pre-load the next ad
//                interstitialAd.loadAd();
//            }
//        });
//        // Load the first ad
//        interstitialAd.loadAd();

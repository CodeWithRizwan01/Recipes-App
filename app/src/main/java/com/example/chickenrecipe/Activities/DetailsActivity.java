package com.example.chickenrecipe.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.applovin.mediation.ads.MaxAdView;
import com.example.chickenrecipe.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DetailsActivity extends AppCompatActivity {

    // For Banner Ad
    private AdView mAdView;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mAdView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Init Layout Views
        ImageView ivDetailImage = findViewById(R.id.ivDetailImage);
        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailCalories = findViewById(R.id.tvDetailCalories);

        TextView tvDetailTime = findViewById(R.id.tvDetailTime);
        TextView tvDetailIngredients = findViewById(R.id.tvDetailIngredients);
        TextView tvDetailInstruction = findViewById(R.id.tvDetailInstruction);

        // get data from intent
        String listType = getIntent().getStringExtra("ListType");
        int image = getIntent().getIntExtra("Image", R.drawable.iv_best_chicken_fajitas);
        String title = getIntent().getStringExtra("Title");
        String time = getIntent().getStringExtra("Time");
        String calories = getIntent().getStringExtra("Calories");
        String fats = getIntent().getStringExtra("Fats");
        String proteins = getIntent().getStringExtra("Proteins");
        String ingredients = getIntent().getStringExtra("Ingredients");
        String instruction = getIntent().getStringExtra("Instruction");

        // set custom tool bar
        Toolbar toolbar = findViewById(R.id.detailToolBar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(listType);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // set data to the views
        ivDetailImage.setImageResource(image);
        tvDetailTitle.setText(title);
        tvDetailTime.setText(time);
        tvDetailCalories.setText(calories);
        tvDetailIngredients.setText(ingredients);

        tvDetailInstruction.setText(Html.fromHtml(instruction));


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
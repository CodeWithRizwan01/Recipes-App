package com.example.chickenrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.example.chickenrecipe.Fragments.FavoriteFragment;
import com.example.chickenrecipe.Fragments.HomeFragment;
import com.example.chickenrecipe.Fragments.RecipeFragment;
import com.example.chickenrecipe.Fragments.SettingFragment;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.onesignal.OneSignal;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FrameLayout mainFrameLayout;
    BottomNavigationView mainBottomNavigation;

    Boolean exitFlag = false;

    // For Banner Ad-App-Lovin
    private AdView mAdView;

    // For One Signal APP_ID (Notification)
//    private static final String ONESIGNAL_APP_ID = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);

        MobileAds.initialize(this);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                Map<String, AdapterStatus> statusMap = initializationStatus.getAdapterStatusMap();
                for (String adapterClass : statusMap.keySet()) {
                    AdapterStatus status = statusMap.get(adapterClass);
                    Log.d("MyApp", String.format(
                            "Adapter name: %s, Description: %s, Latency: %d",
                            adapterClass, status.getDescription(), status.getLatency()));
                }


            }
        });


        // find all the values of ids
        mainFrameLayout = findViewById(R.id.mainFrameLayout);
        mainBottomNavigation = findViewById(R.id.mainBottomNavigation);

        replaceFragment(new HomeFragment());

        mainBottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.opt_home){
                    replaceFragment(new HomeFragment());
                } else if (id == R.id.opt_recipe){
                    replaceFragment(new RecipeFragment());
                } else if (id == R.id.opt_favorite){
                    replaceFragment(new FavoriteFragment());
                } else if (id == R.id.opt_setting){
                    replaceFragment(new SettingFragment());
                }
                return true;
            }
        });

    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.mainFrameLayout, fragment);
        ft.commit();
    }

    // -----> Back Button Showing Dialog
    @Override
    public void onBackPressed() {
        showAlertDialog();
        if (exitFlag) {
            super.onBackPressed();
        }
    }

    public void openNavigationFragment(Fragment fragment, int id){
        replaceFragment(fragment);
        mainBottomNavigation.setSelectedItemId(id);
    }

    // -----> Exit confirmation dialog
    private void showAlertDialog() {
        AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                .setCancelable(false)
                .setTitle("Exit")
                .setMessage("Are you sure want to exit?")
                .setIcon(R.drawable.baseline_error_24)
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        exitFlag = false;
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        exitFlag = true;
                        finish();
                    }
                })
                .create();
        dialog.show();
    }

//    // -----> One Signal App Notification
//    public void oneSignal() {
//        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
//
//        // OneSignal Initialization
//        OneSignal.initWithContext(this);
//        OneSignal.setAppId(ONESIGNAL_APP_ID);
//    }
}
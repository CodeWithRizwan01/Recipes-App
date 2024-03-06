package com.example.chickenrecipe.Fragments;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.chickenrecipe.R;


public class SettingFragment extends Fragment {

    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);

        // init layout views

        LinearLayout settingShareLayout = rootView.findViewById(R.id.settingShareLayout);
        LinearLayout settingRateLayout = rootView.findViewById(R.id.settingRateLayout);
        LinearLayout settingDisclaimer = rootView.findViewById(R.id.settingDisclaimerLayout);

        // get data from shared preferences
        SharedPreferences genderSharedPref = getContext().getSharedPreferences("StartUpSelectiveGender", getContext().MODE_PRIVATE);
        String selectiveGender = genderSharedPref.getString("SelectiveGender", "Male");
        SharedPreferences heightSharedPref = getContext().getSharedPreferences("StartUpSelectiveHeight", getContext().MODE_PRIVATE);
        String selectiveHeight = heightSharedPref.getString("SelectiveHeight", "5ft");
        SharedPreferences weightShardPref = getContext().getSharedPreferences("StartUpSelectiveWeight", getContext().MODE_PRIVATE);
        String selectiveWeight = weightShardPref.getString("SelectiveWeight", "75kg");
        SharedPreferences activityLevelPref = getContext().getSharedPreferences("StartUpSelectiveActivityLevel", getContext().MODE_PRIVATE);
        String activityLevel = activityLevelPref.getString("SelectivePlanGoal", "Very Active");
        SharedPreferences dietExperiencePref = getContext().getSharedPreferences("StartUpSelectiveDietExperience", getContext().MODE_PRIVATE);
        String dietExperience = dietExperiencePref.getString("SelectiveDietExperience", "Intermediate");


        settingShareLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "https://play.google.com/store/apps/details?id=" + getContext().getPackageName();
                String sub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
                myIntent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        settingRateLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=" + getContext().getPackageName())));
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=" + getContext().getPackageName())));
                }
            }
        });

        settingDisclaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.dialog_disclaimer);
                dialog.setCancelable(false);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                TextView btnOk = dialog.findViewById(R.id.tvBtnOk);
                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });


        return rootView;
    }


    // Method to delete the app's cache directory
    public static void deleteCache(Context context) {
        try {
            context.getCacheDir().deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to clear the app's data and cache
    public void clearAppDataAndCache(Context context) {
        try {
            // Get the app's package name
            String packageName = context.getPackageName();

            // Clear the app's data
            Runtime.getRuntime().exec("pm clear " + packageName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
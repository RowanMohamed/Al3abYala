package com.github.rowanmohamed.al3abyala.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.rowanmohamed.al3abyala.R;

/**
 * Created by Merna on 4/16/2018.
 */

public class GymGallery extends AppCompatActivity {
    private static final String TAG = "GymGallery";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_profile);
        Log.d(TAG, "onCreate: started.");
    }

}

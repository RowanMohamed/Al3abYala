package com.github.rowanmohamed.al3abyala.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.github.rowanmohamed.al3abyala.R;

public class GymProfile extends AppCompatActivity {
    private ImageView GymImage;
    private onItemClickListener mListener;
    public interface onItemClickListener{
        void onItemClick(int position);
    }
    public void setonItemClickListener(onItemClickListener listener){
        mListener =listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_profile);

    }

}

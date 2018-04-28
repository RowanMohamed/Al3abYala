package com.github.rowanmohamed.al3abyala.activity;

/**
 * Created by Merna on 4/13/2018.
 */

public class Gym {
    private String mGymName;
    private String mGymLocation;
    private int mImageResourceId;

    public Gym (String gymName, String gymLocation, int imageResourceId){
        mGymName = gymName;
        mGymLocation = gymLocation;
        mImageResourceId = imageResourceId;
    }

    public String getGymName(){return mGymName;}
    public String getGymLocation(){return mGymLocation;}
    public int getImageResourceId() {return mImageResourceId;}
}

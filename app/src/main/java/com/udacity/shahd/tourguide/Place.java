package com.udacity.shahd.tourguide;

/**
 * Created by shahd on 4/8/17.
 */

public class Place {
    private String mTitle;
    private String mDescribtion;
    private String mAddress;
    private int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Place(String mTitle, String mDescribtion, String mAddress, int mImageResourceId) {
        this.mTitle = mTitle;
        this.mDescribtion = mDescribtion;
        this.mImageResourceId = mImageResourceId;
        this.mAddress = mAddress;
    }



    public String getmTitle() {
        return mTitle;
    }

    public String getmDescribtion() {
        return mDescribtion;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmAddress() {
        return mAddress;
    }
}



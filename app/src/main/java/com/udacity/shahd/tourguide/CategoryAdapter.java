package com.udacity.shahd.tourguide;

/**
 * Created by shahd on 4/8/17.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1){
            return new ParksFragment();
        }else if (position == 2){
            return new MallsFragment();
        }else {
            return new MuseumsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.category_malls);
        } else {
            return mContext.getString(R.string.category_museums);
        }
    }
}

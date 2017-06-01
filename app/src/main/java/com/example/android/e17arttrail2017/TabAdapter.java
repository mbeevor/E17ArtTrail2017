package com.example.android.e17arttrail2017;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter for creating tabs and to update view based on user selection
 */

public class TabAdapter extends FragmentPagerAdapter {

    private Context context;

    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    // display appropriate fragment based on selection
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new OffTheMapFragment();
        } else if (position == 2)  {
            return new BlackhorseFragment();
        } else if (position == 3) {
            return new WilliamMorrisFragment();
        } else {
            return new HighStreetFragment();
        }
    }

    // Return the number of tabs to display
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.events);
        } else if (position == 1) {
            return context.getString(R.string.off_the_map);
        } else if (position == 2) {
            return context.getString(R.string.blackhorse);
        } else if (position == 3){
            return context.getString(R.string.william);
        } else {
            return context.getString(R.string.high_street);
        }
    }
}

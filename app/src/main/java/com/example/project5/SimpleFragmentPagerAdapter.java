package com.example.project5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Red Fort", "India Gate", "Rashtrapati Bhawan",
            "Kunzum Travel Cafe", "The Blue Bar"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RedFortFragement();
        } else if (position == 1) {
            return new IndiaGateFragement();
        } else if (position == 2) {
            return new RashtrapatiBhawanFragement();
        } else if (position == 3) {
            return new KunzumTravelCafeFragement();
        } else {
            return new TheBlueBarFragement();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 5;
    }
}



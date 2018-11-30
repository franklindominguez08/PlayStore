package com.fdlsolution.playstore;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{
    int numberOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numberOfTabs = NumOfTabs;

    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                ApplicationFragment fragment = new ApplicationFragment();
                return fragment;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}

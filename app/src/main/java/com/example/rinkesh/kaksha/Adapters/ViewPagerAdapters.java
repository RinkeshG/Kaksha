package com.example.rinkesh.kaksha.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rinkesh on 05/11/17.
 */

public class ViewPagerAdapters extends FragmentPagerAdapter {

    private final List<Fragment> fragments = new ArrayList<>();

    private final List<String> titles = new ArrayList<>();

    public ViewPagerAdapters(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    public void addFragment(Fragment fragment, String string) {

        fragments.add(fragment);

        titles.add(string);

    }
}

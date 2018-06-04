package com.niksan.tabview;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends FragmentPagerAdapter {

    private final List<Fragment> fragments = new ArrayList<>();
    private List<String> fragmentTitles = new ArrayList<>();


    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragmentTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitles.get(position);
       // return null;
    }

    public void addFragment(Fragment fragment, String title){
        fragments.add(fragment);
        fragmentTitles.add(title);
    }

}

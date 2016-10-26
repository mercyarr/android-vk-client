package com.stfalcon.vkclient.activities.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by gbm19 on 24.10.2016.
 */

public class DemoPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;
    public DemoPagerAdapter(FragmentManager fm, Context context) {
       super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = BlankFragment.newInstance();
                break;
            case 1:
                fragment = BlankFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0;
                return context.getString(R.string.friends_all);
            case 1;
                return context.getString(R.string.friends_online);
        }
        return super.getPageTitle(position);


    }
}

package com.stfalcon.vkclient.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

/**
 * Created by gbm19 on 24.10.2016.
 */

public class FragmentActivity  extends AppCompatActivity{
    private TabLayout tabLayout;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmented);
        pager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

    }
}

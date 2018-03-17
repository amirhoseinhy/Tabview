package com.niksan.tabview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "صفحه ششم");
        adapter.addFragment(new TwoFragment(), "صفحه پنجم");
        adapter.addFragment(new ThreeFragment(), "صفحه چهارم");
        adapter.addFragment(new OneFragment(), "صفحه سوم");
        adapter.addFragment(new OneFragment(), "صفحه دوم");
        adapter.addFragment(new OneFragment(), "صفحه اول");


        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
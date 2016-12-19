package com.dream.will.hydrogenballoon.ui;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.dream.will.hydrogenballoon.R;
import com.dream.will.hydrogenballoon.fragment.GonglvFragment;
import com.dream.will.hydrogenballoon.fragment.WoDeFragment;
import com.dream.will.hydrogenballoon.fragment.XingChengDanFragment;
import com.dream.will.hydrogenballoon.fragment.YouJiFragment;

public class HomeActivity extends AppCompatActivity {


    String[] titles = {"攻略", "游记", "行程单", "我的"};
    private Fragment[] fragments;
    private Toolbar toolbar;
    private CollapsingToolbarLayout toolbar_layout;
    private AppBarLayout app_bar;
    private TabLayout tabLayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        initData();
    }


    private void initData() {
        fragments = new Fragment[titles.length];
        GonglvFragment mGonglvFragment = new GonglvFragment();
            fragments[0] = mGonglvFragment;
        YouJiFragment mYouJiFragment = new YouJiFragment();
            fragments[1] = mYouJiFragment;
        XingChengDanFragment mXingChengDanFragment = new XingChengDanFragment();
            fragments[2] = mXingChengDanFragment;
        WoDeFragment mWoDeFragment = new WoDeFragment();
            fragments[3] = mWoDeFragment;

        //2 设置适配器
        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments[position];
            }

            @Override
            public int getCount() {
                return fragments.length;
            }

            // 4. 设置标题
            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
        //3 联动
        tabLayout.setupWithViewPager(viewpager);
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar_layout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        app_bar = (AppBarLayout) findViewById(R.id.app_bar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
    }
}

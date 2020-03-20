package com.bawei.sunshuaixi20200320.activity;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bawei.sunshuaixi20200320.R;
import com.bawei.sunshuaixi20200320.fragment.FiveFragment;
import com.bawei.sunshuaixi20200320.fragment.ForeFragment;
import com.bawei.sunshuaixi20200320.fragment.HomeFragment;
import com.bawei.sunshuaixi20200320.fragment.ThreeFragment;
import com.bawei.sunshuaixi20200320.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp;
    List<Fragment> list=new ArrayList<>();
    List<String> tablist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.vp);
        tab = findViewById(R.id.tab);

        initData();
    }

    private void initData() {
        HomeFragment homeFragment = new HomeFragment();
        TwoFragment twoFragment = new TwoFragment();
        ThreeFragment threeFragment = new ThreeFragment();
        ForeFragment foreFragment = new ForeFragment();
        FiveFragment fiveFragment = new FiveFragment();
        list.add(homeFragment);
        list.add(twoFragment);
        list.add(threeFragment);
        list.add(foreFragment);
        list.add(fiveFragment);
        MyFragment myFragment = new MyFragment(getSupportFragmentManager());
        vp.setAdapter(myFragment);

        tablist.add("首页");
        tablist.add("发现");
        tablist.add("圈子");
        tablist.add("购物车");
        tablist.add("我的");

        tab.addTab(tab.newTab().setText(tablist.get(0)));
        tab.addTab(tab.newTab().setText(tablist.get(1)));
        tab.addTab(tab.newTab().setText(tablist.get(2)));
        tab.addTab(tab.newTab().setText(tablist.get(3)));
        tab.addTab(tab.newTab().setText(tablist.get(4)));

        tab.setupWithViewPager(vp);

    }

    public class MyFragment extends FragmentPagerAdapter{

        public MyFragment(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return list.get(i);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tablist.get(position);
        }
    }
}

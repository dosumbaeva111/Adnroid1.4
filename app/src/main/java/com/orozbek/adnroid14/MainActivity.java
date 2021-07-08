package com.orozbek.adnroid14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orozbek.adnroid14.adapters.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private List<Fragment> list = new ArrayList<>();
    private String[] tabs = {"TITLES","NUMBERS","IMAGES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        adapter = new ViewPagerAdapter(this);
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());
        adapter.addItems(list);
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText(tabs[position])).attach();
    }
}
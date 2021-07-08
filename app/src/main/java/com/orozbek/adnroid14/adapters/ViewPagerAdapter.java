package com.orozbek.adnroid14.adapters;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.LinkedList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {


    private List<Fragment> list = new LinkedList<>();

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public void addItems(List<Fragment> list){
        this.list = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

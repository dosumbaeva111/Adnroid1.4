package com.orozbek.adnroid14;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.orozbek.adnroid14.adapters.FirstAdapter;
import com.orozbek.adnroid14.adapters.User;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    private FirstAdapter adapter;
    private List<User> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_firstk, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        recyclerView = view.findViewById(R.id.first_recycler);
        adapter = new FirstAdapter();
        adapter.addItems(createList());
        recyclerView.setAdapter(adapter);
    }

    public List<User> createList() {
        list.add(new User("ASasdasdD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ASD","asdasd"));
        list.add(new User("ddddASD","asdasdddd"));
        return list;
    }
}
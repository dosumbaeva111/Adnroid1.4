package com.orozbek.adnroid14.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.orozbek.adnroid14.R;

import java.util.LinkedList;
import java.util.List;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.ViewHolder> {

    private List<User> list = new LinkedList<>();

    public void addItems(List<User>list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.first_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name, lastName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_tv);
            lastName = itemView.findViewById(R.id.last_name_tv);
        }

        public void onBind(User user) {
            name.setText(user.getName());
            lastName.setText(user.getLastName());
        }
    }
}

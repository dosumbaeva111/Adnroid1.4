package com.orozbek.adnroid14.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.orozbek.adnroid14.FirstFragment;
import com.orozbek.adnroid14.R;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.second_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(new FirstFragment().createList().get(position));
    }

    @Override
    public int getItemCount() {
        return new FirstFragment().createList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView numbers;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            numbers = itemView.findViewById(R.id.number_tv);
        }

        public void onBind(User user) {
            numbers.setText(String.valueOf(getAdapterPosition()+1));
        }
    }
}

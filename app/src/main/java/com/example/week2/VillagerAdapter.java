package com.example.week2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class VillagerAdapter extends RecyclerView.Adapter<VillagerAdapter.VillagerViewHolder> {
    private String[] villagers;

    public VillagerAdapter(String[] villagers){
        this.villagers = villagers;
    }

    public static class VillagerViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public VillagerViewHolder(View v){
            super(v);
            textView = v.findViewById(R.id.textView);

        }
    }

    @NonNull
    @Override
    public VillagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.villager_card,parent, false);
        VillagerViewHolder villagerViewHolder = new VillagerViewHolder(v);
        return villagerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VillagerViewHolder holder, int position) {
        holder.textView.setText(villagers[position]);
    }

    @Override
    public int getItemCount() {
        return villagers.length;
    }



}

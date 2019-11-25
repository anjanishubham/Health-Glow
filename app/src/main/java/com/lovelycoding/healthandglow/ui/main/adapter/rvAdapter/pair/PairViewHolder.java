package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.pair;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.databinding.PairRvLayoutItemBinding;

public class PairViewHolder extends RecyclerView.ViewHolder {
    public  PairRvLayoutItemBinding itemBinding;
    public PairViewHolder(@NonNull PairRvLayoutItemBinding itemView) {
        super(itemView.getRoot());
        this.itemBinding=itemView;
    }
}

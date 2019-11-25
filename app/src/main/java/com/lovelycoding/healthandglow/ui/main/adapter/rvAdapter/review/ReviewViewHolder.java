package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.review;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.databinding.RateReviewRvLayoutItemBinding;

public class ReviewViewHolder extends RecyclerView.ViewHolder {

    public RateReviewRvLayoutItemBinding itemBinding;
    public ReviewViewHolder(@NonNull RateReviewRvLayoutItemBinding itemView) {
        super(itemView.getRoot());
        this.itemBinding=itemView;
    }
}

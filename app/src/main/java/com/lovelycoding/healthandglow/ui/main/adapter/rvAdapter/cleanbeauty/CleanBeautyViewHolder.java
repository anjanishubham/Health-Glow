package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.cleanbeauty;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.databinding.BeautyLayoutRvItemBinding;

public class CleanBeautyViewHolder extends RecyclerView.ViewHolder {
    BeautyLayoutRvItemBinding dataBindingItem;
    public CleanBeautyViewHolder(@NonNull BeautyLayoutRvItemBinding itemView) {
        super(itemView.getRoot());
        this.dataBindingItem=itemView;
    }
}

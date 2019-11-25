package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.volume;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.databinding.VolumeLayoutRvItemBinding;

public class VolumeViewHolder extends RecyclerView.ViewHolder {
    VolumeLayoutRvItemBinding mItemDataBinding;
    public VolumeViewHolder(@NonNull VolumeLayoutRvItemBinding itemView) {
        super(itemView.getRoot());
        this.mItemDataBinding=itemView;
    }
}

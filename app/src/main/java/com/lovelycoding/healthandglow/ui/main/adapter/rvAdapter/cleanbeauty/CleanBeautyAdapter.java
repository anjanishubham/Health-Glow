package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.cleanbeauty;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.databinding.BeautyLayoutRvItemBinding;
import com.lovelycoding.healthandglow.model.databinding.CleanBeautyDataBinding;

import java.util.ArrayList;
import java.util.List;

public class CleanBeautyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<CleanBeautyDataBinding> imageUrlList;

    public CleanBeautyAdapter() {
        imageUrlList = new ArrayList<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        BeautyLayoutRvItemBinding dataBindingItem = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.beauty_layout_rv_item, parent, false);
        return new CleanBeautyViewHolder(dataBindingItem);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((CleanBeautyViewHolder)holder).dataBindingItem.setCleanBeautyImage(imageUrlList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageUrlList.size();
    }

    public void setImageUrlList(List<CleanBeautyDataBinding> imageUrlList) {
        this.imageUrlList=imageUrlList;
    }
}

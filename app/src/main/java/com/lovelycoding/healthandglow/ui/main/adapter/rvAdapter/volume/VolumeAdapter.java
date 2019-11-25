package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.volume;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.databinding.VolumeLayoutRvItemBinding;
import com.lovelycoding.healthandglow.model.pojo.VolumeItem;

import java.util.ArrayList;
import java.util.List;

public class VolumeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<VolumeItem> mList;
    private String skuId;

    public VolumeAdapter() {
        mList = new ArrayList<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        VolumeLayoutRvItemBinding mItemBinding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.volume_layout_rv_item, parent, false);
        return new VolumeViewHolder(mItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(mList.get(position).getSkuId().equals(skuId)){
            ((VolumeViewHolder)holder).mItemDataBinding.tvProductVolume.setVisibility(View.GONE);
            ((VolumeViewHolder)holder).mItemDataBinding.tvSelectedProductItemVolume.setVisibility(View.VISIBLE);
            ((VolumeViewHolder)holder).mItemDataBinding.tvSelectedProductItemVolume.setTextColor(Color.WHITE);
        }
        else
        ((VolumeViewHolder)holder).mItemDataBinding.setVolume(mList.get(position));
    }
    @Override
    public int getItemCount() {
        return mList.size();
    }
    public void setList(List<VolumeItem> mList, String skuId) {
        this.mList=mList;
        this.skuId=skuId;
    }
}

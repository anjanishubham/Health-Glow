package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.pair;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.databinding.PairRvLayoutItemBinding;
import com.lovelycoding.healthandglow.model.pojo.Sku1;
import com.lovelycoding.healthandglow.model.pojo.Sku2;

import java.util.List;

public class PairAdapter extends RecyclerView.Adapter {
    List<Sku1> mSkul1List;
    List<Sku2> mSkul2List;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        PairRvLayoutItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.pair_rv_layout_item, parent, false);
        return new PairViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((PairViewHolder) holder).itemBinding.setSku1(mSkul1List.get(position));
        ((PairViewHolder) holder).itemBinding.setSku2(mSkul2List.get(position));
    }

    @Override
    public int getItemCount() {
        return mSkul1List.size();
    }

    public void setSkul1AndSkul2List(List<Sku1> mSkul1List, List<Sku2> mSkul2List) {
        this.mSkul1List=mSkul1List;
        this.mSkul2List=mSkul2List;
    }
}

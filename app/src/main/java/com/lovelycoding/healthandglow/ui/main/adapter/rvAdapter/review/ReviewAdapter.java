package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.review;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.databinding.RateReviewRvLayoutItemBinding;
import com.lovelycoding.healthandglow.model.databinding.RateAndReviewDataBinding;

import java.util.ArrayList;
import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter {
    List<RateAndReviewDataBinding> mList;

    public ReviewAdapter() {
        mList = new ArrayList<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RateReviewRvLayoutItemBinding itemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.rate_review_rv_layout_item, parent, false);
        return new ReviewViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((ReviewViewHolder)holder).itemBinding.setReview(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setList(List<RateAndReviewDataBinding> mList) {
        this.mList=mList;
    }
}

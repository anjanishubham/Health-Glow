package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.rvQuestionAnswer;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.databinding.QuestionAnswerRvLayoutItemBinding;

public class QuestionAnswerViewHolder extends RecyclerView.ViewHolder {
    QuestionAnswerRvLayoutItemBinding bindingItem;
    public QuestionAnswerViewHolder(@NonNull QuestionAnswerRvLayoutItemBinding itemView) {
        super(itemView.getRoot());
        this.bindingItem=itemView;
    }
}

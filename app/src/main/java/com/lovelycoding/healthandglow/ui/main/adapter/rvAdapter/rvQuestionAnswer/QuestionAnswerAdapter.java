package com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.rvQuestionAnswer;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.databinding.QuestionAnswerRvLayoutItemBinding;
import com.lovelycoding.healthandglow.model.databinding.QuestionAnswerDataBinding;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnswerAdapter extends RecyclerView.Adapter {
    List<QuestionAnswerDataBinding> mList;

    public QuestionAnswerAdapter() {
        mList = new ArrayList<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        QuestionAnswerRvLayoutItemBinding dataBindingItem = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.question_answer_rv_layout_item, parent, false);
        return new QuestionAnswerViewHolder(dataBindingItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((QuestionAnswerViewHolder)holder).bindingItem.setQuestAns(mList.get(position));

    }

    @Override
    public int getItemCount() {
        if(mList.size()<=3)
            return mList.size();
        return 3;
    }
    public void setList(List<QuestionAnswerDataBinding> mList){
        this.mList=mList;
    }
}

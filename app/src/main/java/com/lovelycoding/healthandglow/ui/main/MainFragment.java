package com.lovelycoding.healthandglow.ui.main;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.databinding.MainFragmentBinding;
import com.lovelycoding.healthandglow.model.pojo.ProductDetail;
import com.lovelycoding.healthandglow.ui.main.viewmodel.MainActivityView;
import com.lovelycoding.healthandglow.ui.main.viewmodel.MainViewModel;

import java.util.List;

public class MainFragment extends Fragment implements MainActivityView {
    private static final String TAG = "MainFragment";
    private MainViewModel mViewModel;
    private MainFragmentBinding mDataBinding;
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mDataBinding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false);
        return mDataBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mViewModel.getTest(this);

    }

    @Override
    public void getProductDetail(ProductDetail mProductDetail) {
        //mainFragmentObserable.setObservableField(mProductDetail.getData().toString());
        Log.d(TAG, "getProductDetail: "+mProductDetail.getData().getCategoryUrlLink());
        Log.d(TAG, "getProductDetail: "+mProductDetail.getData().getBrandUrlLink());
        Log.d(TAG, "getProductDetail: "+mProductDetail.getData().getSkuImageUrls());
        Log.d(TAG, "getProductDetail: "+mProductDetail.getData().getQna().toString());
        mDataBinding.setData(mProductDetail.getData());
       // mDataBinding.text.append(mProductDetail.getData().toString());
        mViewModel.loadingProductImageView(mProductDetail.getData().getSkuImageUrls(),mDataBinding);
        mViewModel.initVolumeRecyclerView(mProductDetail.getData().getVariants().getVolume(),mDataBinding,mProductDetail.getData().getSkuId());
        mViewModel.initProductFaces(mProductDetail.getData().getFacets(), mDataBinding);
        mViewModel.initCleanBeautyRecycleView(mProductDetail.getData().getCleanBeauty().getImageUrls(), mDataBinding);
        mViewModel.initQuestionAnswerRecycleView(mProductDetail.getData().getQna(), mDataBinding);
        mViewModel.initReviewRecycleView(mProductDetail.getData().getReviews(), mDataBinding);
        mViewModel.initPairRecycleView(mProductDetail.getData().getProductCombo(), mDataBinding);
    }

    private void loadingProductImageView(List<String> list) {
       /* mViewPagerAdapter.setProductImageUrl(list);
        mDataBinding.vpItemImage.setAdapter(mViewPagerAdapter);*/
    }

    @Override
    public void getError(Throwable throwable) {
        Toast.makeText(getActivity(), ""+throwable.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        mDataBinding.group.setVisibility(View.GONE);
        Log.d(TAG, "onError: "+ throwable.getLocalizedMessage());
       // mDataBinding.text.setVisibility(View.VISIBLE);
       // mDataBinding.text.append(throwable.getLocalizedMessage());

    }
}

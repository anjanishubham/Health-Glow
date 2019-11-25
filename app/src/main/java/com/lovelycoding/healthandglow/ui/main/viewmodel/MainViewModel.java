package com.lovelycoding.healthandglow.ui.main.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;
import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.databinding.MainFragmentBinding;
import com.lovelycoding.healthandglow.model.databinding.CleanBeautyDataBinding;
import com.lovelycoding.healthandglow.model.databinding.QuestionAnswerDataBinding;
import com.lovelycoding.healthandglow.model.databinding.RateAndReviewDataBinding;
import com.lovelycoding.healthandglow.model.pojo.FacetsItem;
import com.lovelycoding.healthandglow.model.pojo.ProductComboItem;
import com.lovelycoding.healthandglow.model.pojo.QnaItem;
import com.lovelycoding.healthandglow.model.pojo.ReviewsItem;
import com.lovelycoding.healthandglow.model.pojo.Sku1;
import com.lovelycoding.healthandglow.model.pojo.Sku2;
import com.lovelycoding.healthandglow.model.pojo.VolumeItem;
import com.lovelycoding.healthandglow.model.repository.ProductDetailRepository;
import com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.cleanbeauty.CleanBeautyAdapter;
import com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.pair.PairAdapter;
import com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.review.ReviewAdapter;
import com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.rvQuestionAnswer.QuestionAnswerAdapter;
import com.lovelycoding.healthandglow.ui.main.adapter.viewpageradapter.FacetViewPager;
import com.lovelycoding.healthandglow.ui.main.adapter.viewpageradapter.ViewPagerAdapter;
import com.lovelycoding.healthandglow.ui.main.adapter.rvAdapter.volume.VolumeAdapter;
import com.lovelycoding.healthandglow.util.DateConvertor;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private static final String TAG = "MainViewModel";
    // TODO: Implement the ViewModel
    ProductDetailRepository mProductDetailRepository;
    private ViewPagerAdapter mViewPagerAdapter;
    private VolumeAdapter mVolumeAdapter;
    private FacetViewPager mFacetPagerAdapter;
    private CleanBeautyAdapter mCleanBeautyAdapter;
    private QuestionAnswerAdapter mQuestionAnswerAdapter;
    private ReviewAdapter mReviewAdapter;
    private PairAdapter mPairAdapter;


    public MainViewModel(@NonNull Application application) {
        super(application);
        mProductDetailRepository=ProductDetailRepository.getProductDetailRepositoryInstance();
        mViewPagerAdapter = new ViewPagerAdapter();
        mVolumeAdapter=new VolumeAdapter();
        mFacetPagerAdapter=new FacetViewPager();
        mCleanBeautyAdapter=new CleanBeautyAdapter();
        mQuestionAnswerAdapter=new QuestionAnswerAdapter();
        mReviewAdapter=new ReviewAdapter();
        mPairAdapter=new PairAdapter();
    }

    /*public LiveData<ProductDetail> getProductDetail() {
       return mProductDetailRepository.getProductDetail();
    }*/

    public void getTest(MainActivityView view) {
        mProductDetailRepository.getProductDetail(view);
    }

    public void loadingProductImageView(List<String> skuImageUrls, MainFragmentBinding mDataBinding) {
        mViewPagerAdapter.setProductImageUrl(skuImageUrls);
        mDataBinding.vpItemImage.setAdapter(mViewPagerAdapter);
    }

    public void initVolumeRecyclerView(List<VolumeItem> volume, MainFragmentBinding mDataBinding, String skuId) {
        initRecycleView(volume,mDataBinding,skuId);
    }

    private void initRecycleView(List<VolumeItem> volume, MainFragmentBinding mDataBinding, String skuId) {

        RecyclerView rv=mDataBinding.volumeLayout.findViewById(R.id.rvProductVolume);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(layoutManager);
        mVolumeAdapter.setList(volume,skuId);
        rv.setAdapter(mVolumeAdapter);
        mVolumeAdapter.notifyDataSetChanged();
    }

    public void initProductFaces(List<FacetsItem> facets, final MainFragmentBinding mDataBinding) {
        mFacetPagerAdapter.setFactItemList(facets);
        mDataBinding.tabLayoutViewPager.setAdapter(mFacetPagerAdapter);
        mDataBinding.tabLayoutViewPager.setOffscreenPageLimit(facets.size());
        mDataBinding.tabLayout.setupWithViewPager(mDataBinding.tabLayoutViewPager);

       // initTabLayout(mDataBinding, facets);
    }

    public void initCleanBeautyRecycleView(List<String> imageUrls, MainFragmentBinding mDataBinding) {
         List<CleanBeautyDataBinding> mList=new ArrayList<>();
        for (String str : imageUrls) {
            mList.add(new CleanBeautyDataBinding(str));
        }
        mCleanBeautyAdapter.setImageUrlList(mList);
        mDataBinding.rvCleanBeauty.setLayoutManager(new LinearLayoutManager(getApplication(),LinearLayoutManager.HORIZONTAL,false));
        mDataBinding.rvCleanBeauty.setAdapter(mCleanBeautyAdapter);
        mCleanBeautyAdapter.notifyDataSetChanged();
    }


    public void initQuestionAnswerRecycleView(List<QnaItem> qna, MainFragmentBinding mDataBinding) {
        List<QuestionAnswerDataBinding> mList = new ArrayList<>();
         getQuestionAnswerList(qna,mList);
         mQuestionAnswerAdapter.setList(mList);
         mDataBinding.rvQuestionAnswer.setLayoutManager(new LinearLayoutManager(getApplication(),LinearLayoutManager.VERTICAL,false));
         mDataBinding.rvQuestionAnswer.setAdapter(mQuestionAnswerAdapter);
         mQuestionAnswerAdapter.notifyDataSetChanged();



    }

    private void getQuestionAnswerList(List<QnaItem> qna, List<QuestionAnswerDataBinding> mList) {
        for (QnaItem item : qna) {
            QuestionAnswerDataBinding ob = new QuestionAnswerDataBinding();
            ob.setQuestion(item.getQueryText());
            ob.setQuestionPostedDate(DateConvertor.getDate(item.getPostedDate()));
            ob.setQuestionAskedBy(item.getUserNickname());
            ob.setAnswer(item.getAnswer().getAnswerText());
            ob.setAnsweredBy(item.getAnswer().getUserNickname());
            ob.setAnswerPostedDate(DateConvertor.getDate(item.getAnswer().getPostedDate()));
            Log.d(TAG, "getQuestionAnswerList:ob "+ob.toString());
            Log.d(TAG, "getQuestionAnswerList: "+item.toString());
            mList.add(ob);
        }
    }

    public void initReviewRecycleView(List<ReviewsItem> reviews, MainFragmentBinding mDataBinding) {
        List<RateAndReviewDataBinding> mList = new ArrayList<>();
        getReviewArrayList(mList, reviews);
        mReviewAdapter.setList(mList);
        mDataBinding.rvRateAndReview.setLayoutManager(new LinearLayoutManager(getApplication(),LinearLayoutManager.VERTICAL,false));
        mDataBinding.rvRateAndReview.setAdapter(mReviewAdapter);
        mReviewAdapter.notifyDataSetChanged();


    }
    public void getReviewArrayList(List<RateAndReviewDataBinding> mList,List<ReviewsItem> reviewsItemList){

        for (ReviewsItem item : reviewsItemList) {
            RateAndReviewDataBinding ob=new RateAndReviewDataBinding();
            ob.setRating(item.getSkuRating());
            ob.setReviewTitle(item.getReviewTitle());
            ob.setReviewDescription(item.getReviewText());
            ob.setReviewPostBy(item.getUserNickname());
            ob.setReviewPostDate(DateConvertor.getDate(item.getPostedDate()));
            mList.add(ob);
        }
    }

    public void initPairRecycleView(List<ProductComboItem> productCombo, MainFragmentBinding mDataBinding) {
        List<Sku1> mSku1List = new ArrayList<>();
        List<Sku2> mSku2List = new ArrayList<>();
        getList(mSku1List, mSku2List, productCombo);
        mPairAdapter.setSkul1AndSkul2List(mSku1List,mSku2List);
        mDataBinding.rvPair.setLayoutManager(new LinearLayoutManager(getApplication(),LinearLayoutManager.HORIZONTAL,false));
        mDataBinding.rvPair.setAdapter(mPairAdapter);
        mPairAdapter.notifyDataSetChanged();

    }

    private void getList(List<Sku1> mSku1List, List<Sku2> mSku2List, List<ProductComboItem> productCombo) {
        for (ProductComboItem item : productCombo) {
            mSku1List.add(item.getSku1());
            mSku2List.add(item.getSku2());
        }
    }
}

package com.lovelycoding.healthandglow.model.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;

import com.lovelycoding.healthandglow.MainActivity;
import com.lovelycoding.healthandglow.model.netwrok.ApiService;
import com.lovelycoding.healthandglow.model.netwrok.RetrofitClient;
import com.lovelycoding.healthandglow.model.pojo.ProductDetail;
import com.lovelycoding.healthandglow.ui.main.viewmodel.MainActivityView;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleConverter;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class ProductDetailRepository {
    private static final String TAG = "ProductDetailRepository";
    private static ProductDetailRepository mRepoInstance;
    private ApiService mApiService;


    public ProductDetailRepository() {
        mApiService= RetrofitClient.getApiService();
    }

    public static ProductDetailRepository getProductDetailRepositoryInstance() {
        if (mRepoInstance == null) {
            mRepoInstance=new ProductDetailRepository();
        }
        return mRepoInstance;
    }

   /* public LiveData<ProductDetail> getProductDetail() {
        LiveData<ProductDetail> productDetailLiveData =LiveDataReactiveStreams.
                fromPublisher(mApiService.getProductDetail()
                        .subscribeOn(Schedulers.io()));
        return productDetailLiveData;
    }*/

    public void getProductDetail(final MainActivityView view) {

        mApiService.getProductDetail().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<ProductDetail>() {

                    @Override
                    public void onSuccess(ProductDetail productDetail) {
                        view.getProductDetail(productDetail);
                       // Log.d(TAG, "onSuccess: "+productDetail.getData().toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                       view.getError(e);
                        // Log.d(TAG, "onError: ");
                        Log.d(TAG, "onError: "+ e.getLocalizedMessage());
                    }
                });
    }

    }

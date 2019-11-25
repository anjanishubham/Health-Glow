package com.lovelycoding.healthandglow.model.netwrok;

import com.lovelycoding.healthandglow.model.pojo.ProductDetail;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiService {


   /* @GET("catalog/product/v6/106,999/533953?app=web&version=3.0.0&shop=false")
    Flowable<ProductDetail> getProductDetail();
*/
    @GET("catalog/product/v6/106,999/533953?app=web&version=3.0.0&shop=false")
    Single<ProductDetail> getProductDetail();

}

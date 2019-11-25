package com.lovelycoding.healthandglow.model.netwrok;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    //https://staging.healthandglow.com/api/catalog/product/v6/106,999/533953?app=web&version=3.0.0&shop=false
    public static final String BASE_URL="https://staging.healthandglow.com/api/";

    private static Retrofit retrofit= new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private static ApiService service = retrofit.create(ApiService.class);

    public static ApiService getApiService()
    {
        return service;
    }

}

package com.lovelycoding.healthandglow.ui.main.viewmodel;

import com.lovelycoding.healthandglow.model.pojo.ProductDetail;

public interface MainActivityView extends ErrorView {
    public void getProductDetail(ProductDetail mProductDetail);
}

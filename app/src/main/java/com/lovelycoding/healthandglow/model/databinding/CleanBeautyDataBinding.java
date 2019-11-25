package com.lovelycoding.healthandglow.model.databinding;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class CleanBeautyDataBinding {
    private String imageUrl;

    public CleanBeautyDataBinding() {
    }

    public CleanBeautyDataBinding(String imageUrl) {
        this.imageUrl=imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    @BindingAdapter("imageUrl")
    public static void setImage(AppCompatImageView imageView, String imageUrl){
        Picasso.with(imageView.getContext()).load(imageUrl).into(imageView);
    }
}

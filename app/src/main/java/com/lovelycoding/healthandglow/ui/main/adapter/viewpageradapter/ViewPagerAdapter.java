package com.lovelycoding.healthandglow.ui.main.adapter.viewpageradapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.lovelycoding.healthandglow.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
public class ViewPagerAdapter extends PagerAdapter {
    private List<String> productImageUrl;

    public ViewPagerAdapter() {
        productImageUrl = new ArrayList<>();
    }

    @Override
    public int getCount()
    {
        return productImageUrl.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(container.getContext());
        View view = layoutInflater.inflate(R.layout.product_image_view_pager_layout, container, false);
        AppCompatImageView imageView=view.findViewById(R.id.ivProductImage);
        Picasso.with(container.getContext()).load(productImageUrl.get(position)).into(imageView);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }
    public void setProductImageUrl(List<String> list) {
        this.productImageUrl=list;
    }
}

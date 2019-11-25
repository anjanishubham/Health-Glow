package com.lovelycoding.healthandglow.ui.main.adapter.viewpageradapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.lovelycoding.healthandglow.R;
import com.lovelycoding.healthandglow.model.pojo.FacetsItem;
import java.util.ArrayList;
import java.util.List;

public class FacetViewPager extends ViewPagerAdapter {
    private static final String TAG = "FacetViewPager";
    List<FacetsItem> mList;

    public FacetViewPager() {
        mList = new ArrayList<>();
    }

    @Override
    public int getCount()
    {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        try {
            LayoutInflater layoutInflater = LayoutInflater.from(container.getContext());
            View view = layoutInflater.inflate(R.layout.tab_layout_view_pager_item, container, false);
            AppCompatTextView textView = view.findViewById(R.id.tvFacetsDescription);
            textView.setText(mList.get(position).getContent());
            container.addView(view);
            return view;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }
    public void setFactItemList(List<FacetsItem> list) {
        this.mList=list;
    }

    @Nullable

    @Override
    public CharSequence getPageTitle(int position) {
        Log.d(TAG, "getPageTitle: "+mList.get(position).getTitle());
        return mList.get(position).getTitle().toLowerCase();
    }
}

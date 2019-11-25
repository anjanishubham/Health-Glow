package com.lovelycoding.healthandglow.model.databinding;

import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.databinding.BindingAdapter;

public class RateAndReviewDataBinding {
    private String reviewTitle;
    private String reviewDescription;
    private String reviewPostBy;
    private double rating;
    private String reviewPostDate;

    public RateAndReviewDataBinding() {
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    public String getReviewPostBy() {
        return reviewPostBy;
    }

    public void setReviewPostBy(String reviewPostBy) {
        this.reviewPostBy = reviewPostBy;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReviewPostDate() {
        return reviewPostDate;
    }

    public void setReviewPostDate(String reviewPostDate) {
        this.reviewPostDate = reviewPostDate;
    }

    @BindingAdapter("android:rating")
    public static void setRating(AppCompatRatingBar view, double rating) {

        if (view!=null)
        {

            float rate= Float.parseFloat(String.valueOf(rating));

            view.setRating(rate);

        }
    }
}

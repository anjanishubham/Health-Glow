package com.lovelycoding.healthandglow.model.pojo;

import com.google.gson.annotations.SerializedName;

public class ReviewsItem{

	@SerializedName("skuRating")
	private int skuRating;

	@SerializedName("userNickname")
	private String userNickname;

	@SerializedName("reviewText")
	private String reviewText;

	@SerializedName("postedDate")
	private long postedDate;

	@SerializedName("reviewTitle")
	private String reviewTitle;

	public void setSkuRating(int skuRating){
		this.skuRating = skuRating;
	}

	public int getSkuRating(){
		return skuRating;
	}

	public void setUserNickname(String userNickname){
		this.userNickname = userNickname;
	}

	public String getUserNickname(){
		return userNickname;
	}

	public void setReviewText(String reviewText){
		this.reviewText = reviewText;
	}

	public String getReviewText(){
		return reviewText;
	}

	public void setPostedDate(long postedDate){
		this.postedDate = postedDate;
	}

	public long getPostedDate(){
		return postedDate;
	}

	public void setReviewTitle(String reviewTitle){
		this.reviewTitle = reviewTitle;
	}

	public String getReviewTitle(){
		return reviewTitle;
	}

	@Override
 	public String toString(){
		return 
			"ReviewsItem{" + 
			"skuRating = '" + skuRating + '\'' + 
			",userNickname = '" + userNickname + '\'' + 
			",reviewText = '" + reviewText + '\'' + 
			",postedDate = '" + postedDate + '\'' + 
			",reviewTitle = '" + reviewTitle + '\'' + 
			"}";
		}
}
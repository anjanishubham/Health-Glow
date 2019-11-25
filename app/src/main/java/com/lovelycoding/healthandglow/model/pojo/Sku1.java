package com.lovelycoding.healthandglow.model.pojo;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;

import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

public class Sku1{

	@SerializedName("defaultPrice")
	private int defaultPrice;

	@SerializedName("isAvailable")
	private boolean isAvailable;

	@SerializedName("skuImageUrl")
	private String skuImageUrl;

	@SerializedName("tagImageUrlGrid")
	private Object tagImageUrlGrid;

	@SerializedName("parentCategoryName")
	private String parentCategoryName;

	@SerializedName("superCategoryName")
	private String superCategoryName;

	@SerializedName("categoryUrlLink")
	private String categoryUrlLink;

	@SerializedName("skuPromoText")
	private Object skuPromoText;

	@SerializedName("skuTag")
	private Object skuTag;

	@SerializedName("categoryName")
	private String categoryName;

	@SerializedName("skuName")
	private String skuName;

	@SerializedName("deepLinkUrl")
	private String deepLinkUrl;

	@SerializedName("tagImageUrlList")
	private Object tagImageUrlList;

	@SerializedName("brandUrlLink")
	private String brandUrlLink;

	@SerializedName("skuAverageRating")
	private double skuAverageRating;

	@SerializedName("inWishList")
	private boolean inWishList;

	@SerializedName("skuUrlLink")
	private String skuUrlLink;

	@SerializedName("skuId")
	private String skuId;

	@SerializedName("listPrice")
	private int listPrice;

	@SerializedName("skuDiscPercentage")
	private int skuDiscPercentage;

	public void setDefaultPrice(int defaultPrice){
		this.defaultPrice = defaultPrice;
	}

	public int getDefaultPrice(){
		return defaultPrice;
	}

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}

	public void setSkuImageUrl(String skuImageUrl){
		this.skuImageUrl = skuImageUrl;
	}

	public String getSkuImageUrl(){
		return skuImageUrl;
	}

	public void setTagImageUrlGrid(Object tagImageUrlGrid){
		this.tagImageUrlGrid = tagImageUrlGrid;
	}

	public Object getTagImageUrlGrid(){
		return tagImageUrlGrid;
	}

	public void setParentCategoryName(String parentCategoryName){
		this.parentCategoryName = parentCategoryName;
	}

	public String getParentCategoryName(){
		return parentCategoryName;
	}

	public void setSuperCategoryName(String superCategoryName){
		this.superCategoryName = superCategoryName;
	}

	public String getSuperCategoryName(){
		return superCategoryName;
	}

	public void setCategoryUrlLink(String categoryUrlLink){
		this.categoryUrlLink = categoryUrlLink;
	}

	public String getCategoryUrlLink(){
		return categoryUrlLink;
	}

	public void setSkuPromoText(Object skuPromoText){
		this.skuPromoText = skuPromoText;
	}

	public Object getSkuPromoText(){
		return skuPromoText;
	}

	public void setSkuTag(Object skuTag){
		this.skuTag = skuTag;
	}

	public Object getSkuTag(){
		return skuTag;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setSkuName(String skuName){
		this.skuName = skuName;
	}

	public String getSkuName(){
		return skuName;
	}

	public void setDeepLinkUrl(String deepLinkUrl){
		this.deepLinkUrl = deepLinkUrl;
	}

	public String getDeepLinkUrl(){
		return deepLinkUrl;
	}

	public void setTagImageUrlList(Object tagImageUrlList){
		this.tagImageUrlList = tagImageUrlList;
	}

	public Object getTagImageUrlList(){
		return tagImageUrlList;
	}

	public void setBrandUrlLink(String brandUrlLink){
		this.brandUrlLink = brandUrlLink;
	}

	public String getBrandUrlLink(){
		return brandUrlLink;
	}

	public void setSkuAverageRating(double skuAverageRating){
		this.skuAverageRating = skuAverageRating;
	}

	public double getSkuAverageRating(){
		return skuAverageRating;
	}

	public void setInWishList(boolean inWishList){
		this.inWishList = inWishList;
	}

	public boolean isInWishList(){
		return inWishList;
	}

	public void setSkuUrlLink(String skuUrlLink){
		this.skuUrlLink = skuUrlLink;
	}

	public String getSkuUrlLink(){
		return skuUrlLink;
	}

	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	public String getSkuId(){
		return skuId;
	}

	public void setListPrice(int listPrice){
		this.listPrice = listPrice;
	}

	public int getListPrice(){
		return listPrice;
	}

	public void setSkuDiscPercentage(int skuDiscPercentage){
		this.skuDiscPercentage = skuDiscPercentage;
	}

	public int getSkuDiscPercentage(){
		return skuDiscPercentage;
	}

	@Override
 	public String toString(){
		return 
			"Sku1{" + 
			"defaultPrice = '" + defaultPrice + '\'' + 
			",isAvailable = '" + isAvailable + '\'' + 
			",skuImageUrl = '" + skuImageUrl + '\'' + 
			",tagImageUrlGrid = '" + tagImageUrlGrid + '\'' + 
			",parentCategoryName = '" + parentCategoryName + '\'' + 
			",superCategoryName = '" + superCategoryName + '\'' + 
			",categoryUrlLink = '" + categoryUrlLink + '\'' + 
			",skuPromoText = '" + skuPromoText + '\'' + 
			",skuTag = '" + skuTag + '\'' + 
			",categoryName = '" + categoryName + '\'' + 
			",skuName = '" + skuName + '\'' + 
			",deepLinkUrl = '" + deepLinkUrl + '\'' + 
			",tagImageUrlList = '" + tagImageUrlList + '\'' + 
			",brandUrlLink = '" + brandUrlLink + '\'' + 
			",skuAverageRating = '" + skuAverageRating + '\'' + 
			",inWishList = '" + inWishList + '\'' + 
			",skuUrlLink = '" + skuUrlLink + '\'' + 
			",skuId = '" + skuId + '\'' + 
			",listPrice = '" + listPrice + '\'' + 
			",skuDiscPercentage = '" + skuDiscPercentage + '\'' + 
			"}";
		}

		@BindingAdapter("ImageUrl")
	public static void setImageSku1(AppCompatImageView view ,String skuImageUrl){
			Picasso.with(view.getContext()).load(skuImageUrl).into(view);
	}
}
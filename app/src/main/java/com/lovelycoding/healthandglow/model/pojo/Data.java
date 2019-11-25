package com.lovelycoding.healthandglow.model.pojo;

import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.databinding.BindingAdapter;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{
	@SerializedName("isAvailable")
	private boolean isAvailable;

	@SerializedName("tagImageUrlGrid")
	private String tagImageUrlGrid;

	@SerializedName("superCategoryName")
	private String superCategoryName;

	@SerializedName("blogs")
	private List<Object> blogs;

	@SerializedName("categoryUrlLink")
	private String categoryUrlLink;

	@SerializedName("skuPromoText")
	private String skuPromoText;

	@SerializedName("variants")
	private Variants variants;

	@SerializedName("categoryName")
	private String categoryName;

	@SerializedName("skuImageUrls")
	private List<String> skuImageUrls;

	@SerializedName("facets")
	private List<FacetsItem> facets;

	@SerializedName("skuName")
	private String skuName;

	@SerializedName("deepLinkUrl")
	private String deepLinkUrl;

	@SerializedName("variantColorCode")
	private String variantColorCode;

	@SerializedName("reviews")
	private List<ReviewsItem> reviews;

	@SerializedName("deliveryTitle")
	private String deliveryTitle;

	@SerializedName("brandUrlLink")
	private String brandUrlLink;

	@SerializedName("isDiscontinued")
	private boolean isDiscontinued;

	@SerializedName("skuId")
	private String skuId;

	@SerializedName("skuDiscPercentage")
	private int skuDiscPercentage;

	@SerializedName("defaultPrice")
	private int defaultPrice;

	@SerializedName("skuParentCode")
	private String skuParentCode;

	@SerializedName("brandName")
	private String brandName;

	@SerializedName("parentCategoryName")
	private String parentCategoryName;

	@SerializedName("similarItems")
	private String similarItems;

	@SerializedName("qna")
	private List<QnaItem> qna;

	@SerializedName("skuTag")
	private String skuTag;

	@SerializedName("cleanBeauty")
	private CleanBeauty cleanBeauty;

	@SerializedName("volume")
	private String volume;

	@SerializedName("productCombo")
	private List<ProductComboItem> productCombo;

	@SerializedName("tagImageUrlList")
	private String tagImageUrlList;

	@SerializedName("campaign")
	private String campaign;

	@SerializedName("skuBatchNumber")
	private int skuBatchNumber;

	@SerializedName("skuAverageRating")
	private double skuAverageRating;

	@SerializedName("skuReviewCount")
	private int skuReviewCount;

	@SerializedName("variantColor")
	private String variantColor;

	@SerializedName("inWishList")
	private boolean inWishList;

	@SerializedName("skuUrlLink")
	private String skuUrlLink;

	@SerializedName("listPrice")
	private int listPrice;

	@SerializedName("inBasket")
	private boolean inBasket;

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}

	public void setTagImageUrlGrid(String tagImageUrlGrid){
		this.tagImageUrlGrid = tagImageUrlGrid;
	}

	public String getTagImageUrlGrid(){
		return tagImageUrlGrid;
	}

	public void setSuperCategoryName(String superCategoryName){
		this.superCategoryName = superCategoryName;
	}

	public String getSuperCategoryName(){
		return superCategoryName;
	}

	public void setBlogs(List<Object> blogs){
		this.blogs = blogs;
	}

	public List<Object> getBlogs(){
		return blogs;
	}

	public void setCategoryUrlLink(String categoryUrlLink){
		this.categoryUrlLink = categoryUrlLink;
	}

	public String getCategoryUrlLink(){
		return categoryUrlLink;
	}

	public void setSkuPromoText(String skuPromoText){
		this.skuPromoText = skuPromoText;
	}

	public String getSkuPromoText()
	{
		return skuPromoText;
	}

	public void setVariants(Variants variants){
		this.variants = variants;
	}

	public Variants getVariants(){
		return variants;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public void setSkuImageUrls(List<String> skuImageUrls){
		this.skuImageUrls = skuImageUrls;
	}

	public List<String> getSkuImageUrls(){
		return skuImageUrls;
	}

	public void setFacets(List<FacetsItem> facets){
		this.facets = facets;
	}

	public List<FacetsItem> getFacets(){
		return facets;
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

	public void setVariantColorCode(String variantColorCode){
		this.variantColorCode = variantColorCode;
	}

	public String getVariantColorCode(){
		return variantColorCode;
	}

	public void setReviews(List<ReviewsItem> reviews){
		this.reviews = reviews;
	}

	public List<ReviewsItem> getReviews(){
		return reviews;
	}

	public void setDeliveryTitle(String deliveryTitle){
		this.deliveryTitle = deliveryTitle;
	}

	public String getDeliveryTitle(){
		return deliveryTitle;
	}

	public void setBrandUrlLink(String brandUrlLink){
		this.brandUrlLink = brandUrlLink;
	}

	public String getBrandUrlLink(){
		return brandUrlLink;
	}

	public void setIsDiscontinued(boolean isDiscontinued){
		this.isDiscontinued = isDiscontinued;
	}

	public boolean isIsDiscontinued(){
		return isDiscontinued;
	}

	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	public String getSkuId(){
		return skuId;
	}

	public void setSkuDiscPercentage(int skuDiscPercentage){
		this.skuDiscPercentage = skuDiscPercentage;
	}

	public int getSkuDiscPercentage(){
		return skuDiscPercentage;
	}

	public void setDefaultPrice(int defaultPrice){
		this.defaultPrice = defaultPrice;
	}

	public int getDefaultPrice(){
		return defaultPrice;
	}

	public void setSkuParentCode(String skuParentCode){
		this.skuParentCode = skuParentCode;
	}

	public Object getSkuParentCode(){
		return skuParentCode;
	}

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setParentCategoryName(String parentCategoryName){
		this.parentCategoryName = parentCategoryName;
	}

	public String getParentCategoryName(){
		return parentCategoryName;
	}

	public void setSimilarItems(String similarItems){
		this.similarItems = similarItems;
	}

	public String getSimilarItems(){
		return similarItems;
	}

	public void setQna(List<QnaItem> qna){
		this.qna = qna;
	}

	public List<QnaItem> getQna(){
		return qna;
	}

	public void setSkuTag(String skuTag){
		this.skuTag = skuTag;
	}

	public String getSkuTag(){
		return skuTag;
	}

	public void setCleanBeauty(CleanBeauty cleanBeauty){
		this.cleanBeauty = cleanBeauty;
	}

	public CleanBeauty getCleanBeauty(){
		return cleanBeauty;
	}

	public void setVolume(String volume){
		this.volume = volume;
	}

	public String getVolume(){
		return volume;
	}

	public void setProductCombo(List<ProductComboItem> productCombo){
		this.productCombo = productCombo;
	}

	public List<ProductComboItem> getProductCombo(){
		return productCombo;
	}

	public void setTagImageUrlList(String tagImageUrlList){
		this.tagImageUrlList = tagImageUrlList;
	}

	public String getTagImageUrlList(){
		return tagImageUrlList;
	}

	public void setCampaign(String campaign){
		this.campaign = campaign;
	}

	public String getCampaign(){
		return campaign;
	}

	public void setSkuBatchNumber(int skuBatchNumber){
		this.skuBatchNumber = skuBatchNumber;
	}

	public int getSkuBatchNumber(){
		return skuBatchNumber;
	}

	public void setSkuAverageRating(double skuAverageRating){
		this.skuAverageRating = skuAverageRating;
	}

	public double getSkuAverageRating(){
		return skuAverageRating;
	}

	public void setSkuReviewCount(int skuReviewCount){
		this.skuReviewCount = skuReviewCount;
	}

	public int getSkuReviewCount(){
		return skuReviewCount;
	}

	public void setVariantColor(String variantColor){
		this.variantColor = variantColor;
	}

	public String getVariantColor(){
		return variantColor;
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

	public void setListPrice(int listPrice){
		this.listPrice = listPrice;
	}

	public int getListPrice(){
		return listPrice;
	}

	public void setInBasket(boolean inBasket){
		this.inBasket = inBasket;
	}

	public boolean isInBasket(){
		return inBasket;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"isAvailable = '" + isAvailable + '\'' + 
			",tagImageUrlGrid = '" + tagImageUrlGrid + '\'' + 
			",superCategoryName = '" + superCategoryName + '\'' + 
			",blogs = '" + blogs + '\'' + 
			",categoryUrlLink = '" + categoryUrlLink + '\'' + 
			",skuPromoText = '" + skuPromoText + '\'' + 
			",variants = '" + variants + '\'' + 
			",categoryName = '" + categoryName + '\'' + 
			",skuImageUrls = '" + skuImageUrls + '\'' + 
			",facets = '" + facets + '\'' + 
			",skuName = '" + skuName + '\'' + 
			",deepLinkUrl = '" + deepLinkUrl + '\'' + 
			",variantColorCode = '" + variantColorCode + '\'' + 
			",reviews = '" + reviews + '\'' + 
			",deliveryTitle = '" + deliveryTitle + '\'' + 
			",brandUrlLink = '" + brandUrlLink + '\'' + 
			",isDiscontinued = '" + isDiscontinued + '\'' + 
			",skuId = '" + skuId + '\'' + 
			",skuDiscPercentage = '" + skuDiscPercentage + '\'' + 
			",defaultPrice = '" + defaultPrice + '\'' + 
			",skuParentCode = '" + skuParentCode + '\'' + 
			",brandName = '" + brandName + '\'' + 
			",parentCategoryName = '" + parentCategoryName + '\'' + 
			",similarItems = '" + similarItems + '\'' + 
			",qna = '" + qna + '\'' + 
			",skuTag = '" + skuTag + '\'' + 
			",cleanBeauty = '" + cleanBeauty + '\'' + 
			",volume = '" + volume + '\'' + 
			",productCombo = '" + productCombo + '\'' + 
			",tagImageUrlList = '" + tagImageUrlList + '\'' + 
			",campaign = '" + campaign + '\'' + 
			",skuBatchNumber = '" + skuBatchNumber + '\'' + 
			",skuAverageRating = '" + skuAverageRating + '\'' + 
			",skuReviewCount = '" + skuReviewCount + '\'' + 
			",variantColor = '" + variantColor + '\'' + 
			",inWishList = '" + inWishList + '\'' + 
			",skuUrlLink = '" + skuUrlLink + '\'' + 
			",listPrice = '" + listPrice + '\'' + 
			",inBasket = '" + inBasket + '\'' + 
			"}";
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
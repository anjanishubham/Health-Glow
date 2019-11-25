package com.lovelycoding.healthandglow.model.pojo;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.squareup.picasso.Picasso;

public class CleanBeauty{

	@SerializedName("subTitle")
	private String subTitle;

	@SerializedName("imageUrls")
	private List<String> imageUrls;

	@SerializedName("description")
	private String description;

	@SerializedName("cleanBeautyImageUrl")
	private String cleanBeautyImageUrl;

	@SerializedName("title")
	private String title;

	public void setSubTitle(String subTitle){
		this.subTitle = subTitle;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public void setImageUrls(List<String> imageUrls){
		this.imageUrls = imageUrls;
	}

	public List<String> getImageUrls(){
		return imageUrls;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setCleanBeautyImageUrl(String cleanBeautyImageUrl){
		this.cleanBeautyImageUrl = cleanBeautyImageUrl;
	}

	public String getCleanBeautyImageUrl(){

		return cleanBeautyImageUrl;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"CleanBeauty{" + 
			"subTitle = '" + subTitle + '\'' + 
			",imageUrls = '" + imageUrls + '\'' + 
			",description = '" + description + '\'' + 
			",cleanBeautyImageUrl = '" + cleanBeautyImageUrl + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}


}
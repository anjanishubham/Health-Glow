package com.lovelycoding.healthandglow.model.pojo;

import com.google.gson.annotations.SerializedName;

public class FacetsItem{

	@SerializedName("contentUrl")
	private String contentUrl;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("priority")
	private int priority;

	@SerializedName("content")
	private String content;

	public void setContentUrl(String contentUrl){
		this.contentUrl = contentUrl;
	}

	public String getContentUrl(){
		return contentUrl;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setPriority(int priority){
		this.priority = priority;
	}

	public int getPriority(){
		return priority;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"FacetsItem{" + 
			"contentUrl = '" + contentUrl + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",priority = '" + priority + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}
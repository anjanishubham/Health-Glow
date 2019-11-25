package com.lovelycoding.healthandglow.model.pojo;

import com.google.gson.annotations.SerializedName;

public class VolumeItem{

	@SerializedName("volume")
	private String volume;

	@SerializedName("isAvailable")
	private boolean isAvailable;

	@SerializedName("code")
	private int code;

	@SerializedName("name")
	private String name;

	@SerializedName("isSelected")
	private boolean isSelected;

	@SerializedName("volumes")
	private String volumes;

	@SerializedName("family")
	private String family;

	@SerializedName("skuUrlLink")
	private String skuUrlLink;

	@SerializedName("skuId")
	private String skuId;

	public void setVolume(String volume){
		this.volume = volume;
	}

	public String getVolume(){
		return volume;
	}

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}

	public void setCode(int code){
		this.code = code;
	}

	public Object getCode(){
		return code;
	}

	public void setName(String name){
		this.name = name;
	}

	public Object getName(){
		return name;
	}

	public void setIsSelected(boolean isSelected){
		this.isSelected = isSelected;
	}

	public boolean isIsSelected(){
		return isSelected;
	}

	public void setVolumes(String volumes){
		this.volumes = volumes;
	}

	public String getVolumes(){
		return volumes;
	}

	public void setFamily(String family){
		this.family = family;
	}

	public String getFamily(){
		return family;
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

	@Override
 	public String toString(){
		return 
			"VolumeItem{" + 
			"volume = '" + volume + '\'' + 
			",isAvailable = '" + isAvailable + '\'' + 
			",code = '" + code + '\'' + 
			",name = '" + name + '\'' + 
			",isSelected = '" + isSelected + '\'' + 
			",volumes = '" + volumes + '\'' + 
			",family = '" + family + '\'' + 
			",skuUrlLink = '" + skuUrlLink + '\'' + 
			",skuId = '" + skuId + '\'' + 
			"}";
		}
}
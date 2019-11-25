package com.lovelycoding.healthandglow.model.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Variants{

	@SerializedName("volume")
	private List<VolumeItem> volume;

	@SerializedName("flavour")
	private List<Object> flavour;

	@SerializedName("shade")
	private List<Object> shade;

	public void setVolume(List<VolumeItem> volume){
		this.volume = volume;
	}

	public List<VolumeItem> getVolume(){
		return volume;
	}

	public void setFlavour(List<Object> flavour){
		this.flavour = flavour;
	}

	public List<Object> getFlavour(){
		return flavour;
	}

	public void setShade(List<Object> shade){
		this.shade = shade;
	}

	public List<Object> getShade(){
		return shade;
	}

	@Override
 	public String toString(){
		return 
			"Variants{" + 
			"volume = '" + volume + '\'' + 
			",flavour = '" + flavour + '\'' + 
			",shade = '" + shade + '\'' + 
			"}";
		}
}
package com.lovelycoding.healthandglow.model.pojo;

import com.google.gson.annotations.SerializedName;

public class ProductComboItem{

	@SerializedName("sku2")
	private Sku2 sku2;

	@SerializedName("sku1")
	private Sku1 sku1;

	@SerializedName("defaultPrice")
	private String defaultPrice;

	@SerializedName("listPrice")
	private String listPrice;

	public void setSku2(Sku2 sku2){
		this.sku2 = sku2;
	}

	public Sku2 getSku2(){
		return sku2;
	}

	public void setSku1(Sku1 sku1){
		this.sku1 = sku1;
	}

	public Sku1 getSku1(){
		return sku1;
	}

	public void setDefaultPrice(String defaultPrice){
		this.defaultPrice = defaultPrice;
	}

	public String getDefaultPrice(){
		return defaultPrice;
	}

	public void setListPrice(String listPrice){
		this.listPrice = listPrice;
	}

	public String getListPrice(){
		return listPrice;
	}

	@Override
 	public String toString(){
		return 
			"ProductComboItem{" + 
			"sku2 = '" + sku2 + '\'' + 
			",sku1 = '" + sku1 + '\'' + 
			",defaultPrice = '" + defaultPrice + '\'' + 
			",listPrice = '" + listPrice + '\'' + 
			"}";
		}
}
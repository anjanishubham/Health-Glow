package com.lovelycoding.healthandglow.model.pojo;

import com.google.gson.annotations.SerializedName;

public class Answer{

	@SerializedName("answerText")
	private String answerText;

	@SerializedName("userNickname")
	private String userNickname;

	@SerializedName("postedDate")
	private long postedDate;

	public void setAnswerText(String answerText){
		this.answerText = answerText;
	}

	public String getAnswerText(){
		return answerText;
	}

	public void setUserNickname(String userNickname){
		this.userNickname = userNickname;
	}

	public String getUserNickname(){
		return userNickname;
	}

	public void setPostedDate(long postedDate){
		this.postedDate = postedDate;
	}

	public long getPostedDate(){
		return postedDate;
	}

	@Override
 	public String toString(){
		return 
			"Answer{" + 
			"answerText = '" + answerText + '\'' + 
			",userNickname = '" + userNickname + '\'' + 
			",postedDate = '" + postedDate + '\'' + 
			"}";
		}
}
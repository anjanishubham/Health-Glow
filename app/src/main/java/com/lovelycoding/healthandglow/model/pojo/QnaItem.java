package com.lovelycoding.healthandglow.model.pojo;

import com.google.gson.annotations.SerializedName;

public class QnaItem{

	@SerializedName("answer")
	private Answer answer;

	@SerializedName("queryText")
	private String queryText;

	@SerializedName("userNickname")
	private String userNickname;

	@SerializedName("postedDate")
	private long postedDate;

	public void setAnswer(Answer answer){
		this.answer = answer;
	}

	public Answer getAnswer(){
		return answer;
	}

	public void setQueryText(String queryText){
		this.queryText = queryText;
	}

	public String getQueryText(){
		return queryText;
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
			"QnaItem{" + 
			"answer = '" + answer + '\'' + 
			",queryText = '" + queryText + '\'' + 
			",userNickname = '" + userNickname + '\'' + 
			",postedDate = '" + postedDate + '\'' + 
			"}";
		}
}
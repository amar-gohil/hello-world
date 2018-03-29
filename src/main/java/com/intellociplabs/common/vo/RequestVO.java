package com.intellociplabs.common.vo;

import java.util.HashMap;


public class RequestVO<T> {

	private String userId;
	private String countryId;
	private String categoryId;
	private T valueObject;
	
	
	private HashMap<String,String> paramMap;
	 
	
	public RequestVO() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public T getValueObject() {
		return valueObject;
	}

	public void setValueObject(T valueObject) {
		this.valueObject = valueObject;
	}

	public HashMap<String, String> getParamMap() {
		return paramMap;
	}

	public void setParamMap(HashMap<String, String> paramMap) {
		this.paramMap = paramMap;
	}

	
	@Override
	public String toString() {
		return "RequestVO [userId=" + userId + ", countryId=" + countryId + ", categoryId=" + categoryId
				+ ", valueObject=" + valueObject + ", paramMap=" + paramMap + "]";
	}
	
	
}

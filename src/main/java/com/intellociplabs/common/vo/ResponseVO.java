package com.intellociplabs.common.vo;

import java.util.ArrayList;

public class ResponseVO<T> {
	
	private String statusCode;
	private String statusDescription;
	private T valueObject;
	private ArrayList<T> data;
	private int totalRecords;
	

	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public T getValueObject() {
		return valueObject;
	}
	public void setValueObject(T valueObject) {
		this.valueObject = valueObject;
	}
	public ArrayList<T> getData() {
		return data;
	}
	public void setData(ArrayList<T> data) {
		this.data = data;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	
	
	
}

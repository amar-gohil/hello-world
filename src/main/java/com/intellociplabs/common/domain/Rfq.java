package com.intellociplabs.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rfq {

	@Id    
    protected String id;
	
	@Column
	protected String productId;
	
	@Column
	protected String fullName;
	
	@Column
	protected String officialEmail;
	
	@Column
	protected String companyName;
	
	@Column
	protected String contactNo;
	
	@Column
	protected Double packages;
	
	@Column
	protected String packageType;
	
	@Column
	protected String isActive;

	@Column
	protected Long rfqDate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getOfficialEmail() {
		return officialEmail;
	}

	public void setOfficialEmail(String officialEmail) {
		this.officialEmail = officialEmail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Double getPackages() {
		return packages;
	}

	public void setPackages(Double packages) {
		this.packages = packages;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Long getRfqDate() {
		return rfqDate;
	}

	public void setRfqDate(Long rfqDate) {
		this.rfqDate = rfqDate;
	}


}

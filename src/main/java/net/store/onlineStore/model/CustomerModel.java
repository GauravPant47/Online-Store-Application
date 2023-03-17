package net.store.onlineStore.model;

import java.util.Date;

public class CustomerModel {
	private int custmerId;
	private String name;
	private String emailId;
	private Date dob;
	private long mobileNumber;
	private String customerAddress;
	
	
	public int getCustmerId() {
		return custmerId;
	}
	public void setCustmerId(int custmerId) {
		this.custmerId = custmerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	
	
}

package com.nit.customer;

public class Customer 
{
	private String customerName;
	private String customeId;

	public Customer() {
		super();
	}

	public Customer(String customerName, String customeId) {
		this.customerName = customerName;
		this.customeId = customeId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomeId() {
		return customeId;
	}

	public void setCustomeId(String customeId) {
		this.customeId = customeId;
	}

}

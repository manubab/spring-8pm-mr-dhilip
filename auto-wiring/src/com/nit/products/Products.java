package com.nit.products;

public class Products 
{
	private String productName;
	private String productId;
	
	
	public Products() {
		super();
	}


	public Products(String productName, String productId) {
		this.productName = productName;
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	
	
	
	
	

}

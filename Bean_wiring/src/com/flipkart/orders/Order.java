package com.flipkart.orders;

import com.flipkart.products.Product;

public class Order 
{
	private String orderId;
	private String orderValue;
	private Product product;
	
	public Order() {
		super();
	}

	public Order(String orderId, String orderValue, Product product) {
		this.orderId = orderId;
		this.orderValue = orderValue;
		this.product = product;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
	
	
	
	

}

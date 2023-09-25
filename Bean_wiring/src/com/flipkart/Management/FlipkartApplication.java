package com.flipkart.Management;

import com.flipkart.orders.Order;

public class FlipkartApplication
{
	private int totalProducts;
	private Order order;
	
	public FlipkartApplication() {
		super();
	}

	public FlipkartApplication(int totalProducts, Order order) {
		this.totalProducts = totalProducts;
		this.order = order;
	}

	public int getTotalProducts() {
		return totalProducts;
	}

	public void setTotalProducts(int totalProducts) {
		this.totalProducts = totalProducts;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	
	
	
	

}

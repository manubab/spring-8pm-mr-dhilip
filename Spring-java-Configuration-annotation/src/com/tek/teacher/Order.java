package com.tek.teacher;

import org.springframework.stereotype.Component;


public class Order {
	private String orderId;

	public Order() {
		System.out.println("Object created :0-param "+ "Order");
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Order(String orderId) {
		this.orderId = orderId;
	}

}

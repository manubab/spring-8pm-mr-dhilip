package com.tek.teacher;

import org.springframework.stereotype.Component;

@Component("product1")
public class Product {
	private String productId;
	private String productName;

	public Product() {
		System.out.println("object created : 0-param");
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
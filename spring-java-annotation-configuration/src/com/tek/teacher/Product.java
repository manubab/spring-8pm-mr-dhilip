package com.tek.teacher;

import org.springframework.stereotype.Component;

@Component
public class Product
{
	private String productId;
	
	

	public Product() {
		System.out.println("object created :0-param");	
	}

	public Product(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	
	
	

}

package com.tek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tek.teacher.Product;

@Configuration
public class ProductBeanConfiguration
{
	@Bean("mouse")
	public Product getProductInstance()
	{
		Product product=new Product();
		product.setProductId("A1111");
		product.setProductName("Mouse");
		product.setProductPrice("900.0");
		
		return product;
	}
	
	

}

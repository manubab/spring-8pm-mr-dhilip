package com.tek.teacher.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tek.teacher.Product;

@Configuration
public class BeanConfiguration
{
	@Bean(name="product")
	public Product getProductInstace()
	{
		
		return new Product();
	}
  
}

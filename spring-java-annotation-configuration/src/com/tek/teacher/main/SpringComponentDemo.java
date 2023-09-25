package com.tek.teacher.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tek.teacher.Product;
import com.tek.teacher.config.BeanConfiguration;

public class SpringComponentDemo {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.tek.teacher.config");
//		context.register(BeanConfiguration.class);
//		context.refresh();

		Product product = (Product) context.getBean("product");

		System.out.println(product);

	}

}

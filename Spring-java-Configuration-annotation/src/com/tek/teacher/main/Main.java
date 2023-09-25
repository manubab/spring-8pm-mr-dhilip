package com.tek.teacher.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tek.teacher.Order;
import com.tek.teacher.Product;
import com.tek.teacher.Student;

public class Main
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		
	//	ac.scan("com.tek.*,com.infosys.*","com.security.*");
		ac.register(BeanConfiguration.class);
		ac.refresh();
		
		
		
		Product product = 	ac.getBean(Product.class);
		System.out.println(product);
		
		Product product2 = (Product) ac.getBean("product1");
		System.out.println(product2);
		
		Student stu = ac.getBean(Student.class);
		System.out.println(stu);
		
		//Order Object Configured via Configuration class and Bean Method 
		Order order = (Order )ac.getBean("order2");
		System.out.println(order);
		
		
	}

}

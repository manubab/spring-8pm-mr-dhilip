package com.manu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiMainAppTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		
		ac.scan("com.manu.*");
		ac.refresh();
		
		Employee employee =ac.getBean(Employee.class);
		System.out.println(employee.getAddress1());
		
		System.out.println(employee.getAddress2());
	}

}

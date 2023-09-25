package com.manu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		
		ac.scan("com.*");
		ac.refresh();
		
		Operations ob=ac.getBean(Operations.class);
		
		int k=ob.updateDetails();
		
		System.out.println( k+" details updated successfully ");
	}
	

}

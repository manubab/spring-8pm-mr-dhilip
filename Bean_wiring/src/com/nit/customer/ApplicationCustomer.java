package com.nit.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationCustomer {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("D:\\String8pm\\Bean_wiring\\beans.xml");
		
		Customer c1=(Customer)context.getBean("c1");
        System.out.println(c1);
		System.out.println(c1.getCustomeId());
		Customer c2=(Customer)context.getBean("c1");
		System.out.println(c2);
		System.out.println(c2.getCustomerName());
		
	}

}

package com.amazon;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication 
{
	public static void main(String[] args) 
	{
		BeanFactory factory=new FileSystemXmlApplicationContext("D:\\String8pm\\dependency_injection\\bean.xml");
		
	Products p1=(Products)factory.getBean("iPhnoe");
	
	System.out.println(p1);
	
	System.out.println(p1.getProductId());
	System.out.println(p1.isExpaired());
	System.out.println(p1.getProducts());
	
	System.out.println(new Date());
	
	System.out.println("--------------------");
	System.out.println(p1.getProductManagement().keySet());
	}

}

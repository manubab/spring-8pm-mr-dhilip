package com.nit.products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProductApplication {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("D:\\String8pm\\auto-wiring\\beans.xml");

		Products p1 = (Products) context.getBean("p1");
		System.out.println(p1);
		System.out.println(p1.getProductId());
		System.out.println("------------------------------------------------");
		Products p2 = (Products) context.getBean("p1");
		System.out.println(p2);
		System.out.println(p2.getProductId());
		
		System.out.println("------------------------------------------------");
		Products p3 = (Products) context.getBean("p1");
		System.out.println(p3);
		System.out.println(p3.getProductId());


	}

}

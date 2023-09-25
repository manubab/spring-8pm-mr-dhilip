package com.naresh.it.course.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansAutowiredApplication {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.naresh.*");
		
		//All Compont classes Objects create
		context.refresh();
		
		Address home = (Address) context.getBean("home");
		System.out.println(home);
		
		Address office = (Address) context.getBean("office");
		System.out.println(office);
		
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		System.out.println(emp.getAddress());

	}

}

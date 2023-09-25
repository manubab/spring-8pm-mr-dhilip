package com.zoo.animal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		System.out.println(context.getBean(Zoo.class).getAnimal());
		
	}

}

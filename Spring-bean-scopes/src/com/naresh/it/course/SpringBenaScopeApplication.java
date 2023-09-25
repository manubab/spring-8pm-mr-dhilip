package com.naresh.it.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBenaScopeApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.naresh.*");
		context.refresh();
		
		// 1time : python 
		CourseDetails course =  (CourseDetails) context.getBean("python");
		System.out.println(course);
		//2 time : python
		CourseDetails course2 =  (CourseDetails) context.getBean("python");
		System.out.println(course2);
		
		// 1time : java 
		CourseDetails course3 =  (CourseDetails) context.getBean("java");
		System.out.println(course3);
		
		// 2time : java 
		CourseDetails course4 =  (CourseDetails) context.getBean("java");
		System.out.println(course4);

	}

}
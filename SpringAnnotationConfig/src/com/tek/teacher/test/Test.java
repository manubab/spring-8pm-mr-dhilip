package com.tek.teacher.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.tek.teacher.Student;
import com.tek.teacher.config.MyAppConfig;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        
		ac.register(MyAppConfig.class);
		ac.refresh();
		
		Student student = ac.getBean("student",Student.class);

		System.out.println(student);
		ac.close();

	}

}

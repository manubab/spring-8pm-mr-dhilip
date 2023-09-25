package com.tek.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tek.config.BeansConfiguration;
import com.tek.config.ProductBeanConfiguration;
import com.tek.teacher.Product;
import com.tek.teacher.Student;

public class Main {
	public static void main(String[] args) {

//		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(BeansConfiguration.class);
//		
//		Student ob1=(Student) ac.getBean("student1");
//		System.out.println(ob1);
//		
//		Student ob2=(Student) ac.getBean("student1");
//		System.out.println(ob2);
//		
//		Student ob3=(Student) ac.getBean("student2");
//		System.out.println(ob3);

		// AnnotationConfigApplicationContext ac=new
		// AnnotationConfigApplicationContext(BeansConfiguration.class,ProductBeanConfiguration.class);

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(BeansConfiguration.class, ProductBeanConfiguration.class);
		ac.refresh();

		Product mouse = (Product) ac.getBean("mouse");

		System.out.println(mouse.getProductId());

		Student student1 = (Student) ac.getBean("student1");

		System.out.println(student1.getStudentBranch());
	}

}

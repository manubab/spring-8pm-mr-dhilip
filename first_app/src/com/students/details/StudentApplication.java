package com.students.details;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentApplication {
	public static void main(String[] args) {
		// IOC Creating

		BeanFactory factory = new FileSystemXmlApplicationContext("D:\\String8pm\\first_app\\beans.xml");

		
		Address addr1=(Address)factory.getBean("ad1");
		
		System.out.println(addr1.getCity());
		System.out.println(addr1.getState());

		
		Student s1 = (Student) factory.getBean("student1");
		
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getAddress());
		
		
	Student s3 = (Student) factory.getBean("student3");
		
		System.out.println(s3.getStudentId());
		System.out.println(s3.getStudentName());
		System.out.println(s3.getAddress());
		
		

	}

}

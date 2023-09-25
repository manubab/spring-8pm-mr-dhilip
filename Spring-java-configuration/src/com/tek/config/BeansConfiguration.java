package com.tek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tek.teacher.Student;

@Configuration
public class BeansConfiguration
{
	@Bean(name="student1")
	public Student getStudent1()
	{
		return new Student();
	}
	
	
	@Bean(name="student2")
	public Student getStudent2()
	{
		return new Student();
	}

	

}

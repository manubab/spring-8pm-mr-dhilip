package com.naresh.it.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
	
	@Bean("java")
	@Scope("prototype")
	CourseDetails getCourseDetails() {
		
		CourseDetails java = new CourseDetails();
		java.setCourseName("Java");
		java.setNoOfDays(100);
		return java;
	}

}


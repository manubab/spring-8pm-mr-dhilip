package com.naresh.it.course.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringBeanConfiguration 
{
	@Bean("home")
	public Address getHomeAddess() {
		return new Address();
	}

}

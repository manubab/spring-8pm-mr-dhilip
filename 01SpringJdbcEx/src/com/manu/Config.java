package com.manu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config 
{
	@Bean
	public JdbcTemplate getJdbcTemplate()
	{
		DriverManagerDataSource dc=new DriverManagerDataSource();
		dc.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dc.setUsername("system");
		dc.setPassword("tiger");
		
		return new JdbcTemplate(dc);
	}

}

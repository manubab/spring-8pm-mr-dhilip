package my.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config 
{
	@Bean
	public JdbcTemplate getInstance()
	{
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setUrl("jdbc:orcle:thin:@localhost:1521:orcl");
		source.setUsername("system");
		source.setPassword("tiger");
		
		return new JdbcTemplate(source);
	}

}

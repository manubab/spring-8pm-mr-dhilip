package my.app.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("my.app.*")
public class Config
{
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("system");
		dataSource.setPassword("tiger");
		
		return dataSource;
		
	}
	
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getFactoryBean()
	{
		LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
		
		bean.setDataSource(getDataSource());
		bean.setPackagesToScan("my.app.*");
		
		HibernateJpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
		
		bean.setJpaProperties(getProperties());
		bean.setJpaVendorAdapter(adapter);
		
		return bean;
	}
	@Bean
	public Properties getProperties()
	{
	    Properties hebernateProperties=new Properties();
	     
	    hebernateProperties.setProperty("hibernate.hbm2ddl.auto","create");
	    
	    hebernateProperties.setProperty("hibernate.show_sql", "true"); 
	    
		return hebernateProperties;
	}
	
	@Bean("transactionManager")
	public PlatformTransactionManager getPlatformTransactionManager()
	{
		JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
		
		jpaTransactionManager.setEntityManagerFactory(getFactoryBean().getObject());
		
		return jpaTransactionManager;
	}
	

}

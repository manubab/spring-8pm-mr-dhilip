package my.manu.config;

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
@EnableJpaRepositories("my.*")
public class Config
{

	@Bean
	public DataSource getSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("system");
		dataSource.setPassword("tiger");
		return dataSource;
		
	}
	
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(getSource());
		factoryBean.setPackagesToScan("my.*");
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factoryBean.setJpaVendorAdapter(adapter);
		factoryBean.setJpaProperties(getProperties());
		return factoryBean;
		
	}
	
	@Bean("transactionManager")
	public PlatformTransactionManager  createPlatformTransactionManager()
	{
		JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(containerEntityManagerFactoryBean().getObject());
		return jpaTransactionManager;
		
	}
	@Bean
	public Properties getProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
		hibernateProperties.setProperty("hibernate.show_sql","true");
		return hibernateProperties;
	}
}

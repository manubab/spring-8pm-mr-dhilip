package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication
{
	public static void main(String[] args) 
	{
		// IOC Container 
		
		BeanFactory fact=new FileSystemXmlApplicationContext("D:\\String8pm\\first_app\\bean.xml");
		
		OrderDetails or1=(OrderDetails)fact.getBean("or1");
		
		System.out.println(or1.getItemsPrices().keySet());
		
	}

}

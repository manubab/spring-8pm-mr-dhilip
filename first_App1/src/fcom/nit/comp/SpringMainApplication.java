package fcom.nit.comp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringMainApplication
{
	public static void main(String[] args)
	{
		BeanFactory factory=new FileSystemXmlApplicationContext("D:\\String8pm\\first_App1\\beans.xml");
		Object o=factory.getBean("pro1");
		ProductDetails pro=(ProductDetails)o;
		
		System.out.println("------------Product 1 Details--------------");
		
		System.out.println(pro.getProductId());
		System.out.println(pro.getProductName());
	    System.out.println(pro.getProductPrice());
	    ProductDetails pro2=(ProductDetails)factory.getBean("pro2");
		System.out.println("------------Product 1 Details--------------");
	    System.out.println(pro2.getProductId());
	    System.out.println(pro2.getProductName());
	    System.out.println(pro2.getProductPrice());
	    
		System.out.println("------------OrderDetails  Details--------------");
		
		OrderDetails or1=(OrderDetails)factory.getBean("order1");
		
		System.out.println(or1.getOrderId());
		System.out.println(or1.getOrderPrice());
		System.out.println(or1.getItems());

		
		
	}

}

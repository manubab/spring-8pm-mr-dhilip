package my.manu.main;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.manu.entity.Product;
import my.manu.operations.DbOperations;

public class ProductApplication
{
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		
		ac.scan("my.*");
		ac.refresh();
		DbOperations db=ac.getBean(DbOperations.class);
		
		
		Product p1=new Product();
		p1.setProductCode("11A12");
		p1.setProductName("Book");
		p1.setProductPrice(3200.0);
	    p1.setProductManuFactureDate(new Date());
	    
	    db.addProduct(p1);
	}

}

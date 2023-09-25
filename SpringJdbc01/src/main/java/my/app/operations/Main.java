package my.app.operations;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
     public static void main(String[] args) 
     {
    	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	 context.scan("my.app");
    	 context.refresh();
    	 
    	 Opeations ob=context.getBean(Opeations.class);
    	 
    	 int insertedDetails=ob.addDetails();
    	 
    	 System.out.println(" no of "+ insertedDetails);
	}
}

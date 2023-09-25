package my.app.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.app.entity.Employee;
import my.app.operations.Operations;

public class EmployeeApplication 
{
	public static void main(String[] args) 
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("my.app");
		context.refresh();
		Operations op= context.getBean(Operations.class);
		
		Employee emp=new Employee();
		emp.setEmployeeId("A431");
		emp.setEmployeeName("sonu");
		emp.setEmployeeSalary(23200.0);
		
		op.addEmployee(emp);
		
		Employee emp1=new Employee();
		emp1.setEmployeeId("A521");
		emp1.setEmployeeName("Manu");
		
		op.updateEmployee(emp1);
		
		List<Employee>  list=Arrays.asList(emp,emp1);
		
		op.addMultiEmployees(list);
		
		op.deleteEmployee("A431");
		
		op.deleteAllEmployees();
		
		
		
		
		
		
	}

}

package com.naresh.it.course.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	private String employeName;
	private double salary;
	
	//Dependency of other Object: 
	//Field Injection
	// 2 Objects of Address : home,office
	
	
	@Qualifier("office")
	@Autowired
	private Address address;

	public Employee() {
		System.out.println("Employee Obj Created");
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

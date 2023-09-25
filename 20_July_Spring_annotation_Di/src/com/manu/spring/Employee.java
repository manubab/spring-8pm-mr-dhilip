package com.manu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String employeeName;
	
	

	private double employeeSalary;
	
	
	private Product product;
	
	Address address1;
	
	
	Address address2;
	
	
	public Employee() {
		super();
		System.out.println("Employee object reated :0-param");
	}
	
	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	public Address getAddress1() {
		return address1;
	}

   
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}


	public Address getAddress2() {
		return address2;
	}

	@Autowired
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}

	@Autowired
	public Employee(Product product, Address address1) {
		super();
		this.product = product;
		this.address1 = address1;
	}

	
	
	

	
	
	
	
	
	
	
	

}

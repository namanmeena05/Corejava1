package com.rays.implicite;

public class Employee extends EmployeeData {
	
	private double salary =00;
	public Employee(String fn, String ln, String companyName,double salary) {
		super(fn, ln, companyName);
		System.out.println(this.salary=salary);
		}

	
}

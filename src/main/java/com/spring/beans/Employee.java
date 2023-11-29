package com.spring.beans;

public class Employee {
	
	int idNumber;
	float salary;
	
	
	public Employee(int idNumber, float salary) {
		super();
		this.idNumber = idNumber;
		this.salary = salary;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	
	public Employee () {
		
		System.out.println("Employee constructor invoked.....");
		
	}

}

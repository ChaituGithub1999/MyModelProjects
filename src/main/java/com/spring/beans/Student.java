package com.spring.beans;

public class Student {
	
	String name;
	String address;
	
	Employee employee;
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Student(String name, String address) {
	

		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student () {
		
		System.out.println("Student constructor invoked.....");

		
	}
	
	
		
	

}

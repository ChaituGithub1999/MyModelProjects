package com.spring.practice;

public class Organisation {
	
	int IdNumber;
	float salary;
	
	public Organisation() {
		System.out.println("Organisation Constructor invoked.......");
	}
	
	public int getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(int idNumber) {
		IdNumber = idNumber;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	

}

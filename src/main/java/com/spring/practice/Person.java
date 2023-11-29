package com.spring.practice;

public class Person {

	String name;
	int age;
	Organisation org;
	
	
	public Person() {
		System.out.println("Person Constructor invoked.....");
	}
	


	public Organisation getOrg() {
		return org;
	}



	public void setOrg(Organisation org) {
		this.org = org;
	}



	public Person(String name, int age, Organisation org) {
		super();
		this.name = name;
		this.age = age;
		this.org = org;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

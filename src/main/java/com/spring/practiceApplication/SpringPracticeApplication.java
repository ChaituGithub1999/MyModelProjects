package com.spring.practiceApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;
import com.spring.beans.Student;
import com.spring.practice.Organisation;
import com.spring.practice.Person;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
		
		ApplicationContext container = new ClassPathXmlApplicationContext("classpath:personBeans.xml");
		Person p = container.getBean(Person.class);
		
		Organisation orgRef = p.getOrg();
		System.out.println(orgRef.getSalary());
		System.out.println(p.getAge());
		
		System.out.println(p.getName());
		System.out.println(orgRef.getIdNumber());
		
		
		
	}
}

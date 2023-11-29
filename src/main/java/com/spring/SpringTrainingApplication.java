package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;
import com.spring.beans.Student;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class SpringTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTrainingApplication.class, args);
		
		ApplicationContext container = new ClassPathXmlApplicationContext("classpath:studentBeans.xml");
	
		/*Student s1 = container.getBean(Student.class);
		System.out.println(s1.getName());
		
		Object s2 =container.getBean("stu");
		Student s2Obj =(Student)s2;
		System.out.println(s2Obj.getAddress());
		
		Student s3 =container.getBean("stu", Student.class);
		System.out.println(s3.getName());
		
		int count =container.getBeanDefinitionCount();
		System.out.println(count);
		
	
		
	Student s=	 container.getBean(Student.class);
	System.out.println(s.getAddress());
	System.out.println(s.getName());
	Employee e = container.getBean(Employee.class);
		System.out.println(e.getIdNumber());
		System.out.println(e.getSalary());
		
		*/
		
		
		Student sObj = container.getBean(Student.class);
		String name = sObj.getName();
		Employee emp = sObj.getEmployee();
		System.out.println(name);
		System.out.println(emp.getSalary());
		
	}

}

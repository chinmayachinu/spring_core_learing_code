package com.infinite.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/infinite/springcore/autowire/autowire-config.xml");
		Employee employee= context.getBean("employee" , Employee.class);
		System.out.println(employee);
	}

}

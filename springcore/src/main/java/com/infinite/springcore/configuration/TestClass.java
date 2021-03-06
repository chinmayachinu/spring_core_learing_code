package com.infinite.springcore.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(Config.class);
		applicationContext.refresh();
		Person person = applicationContext.getBean("person", Person.class);
		person.doRead();
		System.out.println("***********************");
		EmployeeBeanImplementation beanImplementation = applicationContext.getBean("getEmployeeBeanImplementation",
				EmployeeBeanImplementation.class);
		beanImplementation.getFullName();
	}

}

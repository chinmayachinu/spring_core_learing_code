package com.infinite.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/infinite/springcore/collections/collection-config.xml");
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCourses());
		System.out.println(employee.getPhones());

	}

}

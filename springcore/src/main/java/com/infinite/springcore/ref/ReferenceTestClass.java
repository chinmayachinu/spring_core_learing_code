package com.infinite.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/infinite/springcore/ref/reference-config.xml");
		Programmers programmers= context.getBean("programmers" , Programmers.class);
		System.out.println(programmers);
		System.out.println(programmers.getName());
		System.out.println(programmers.getLaptop().getModelName());

	}

}

package com.infinite.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/infinite/springcore/standalone/collections/standalone-collections-config.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person.getEducation());
		System.out.println(person.getFriends());
		System.out.println(person.getLanguages());
	}
	
}

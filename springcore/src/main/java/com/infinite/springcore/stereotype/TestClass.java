package com.infinite.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/infinite/springcore/stereotype/stereotype-config.xml");
		Person person = context.getBean("per", Person.class);
		System.out.println(person);
		System.out.println(person.hashCode());
		System.out.println("***********************");
		Person person1=context.getBean("per", Person.class);
		System.out.println(person1.hashCode());

	}

}

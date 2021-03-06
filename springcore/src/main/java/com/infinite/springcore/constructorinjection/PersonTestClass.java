package com.infinite.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/infinite/springcore/constructorinjection/constructioninjection-config.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		
		Addition addition= context.getBean("addition" , Addition.class);
		addition.doSum();
		
	}

}

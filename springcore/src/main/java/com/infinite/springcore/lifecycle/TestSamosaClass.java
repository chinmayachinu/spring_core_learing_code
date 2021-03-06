package com.infinite.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosaClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/infinite/springcore/lifecycle/lifecycle-config.xml");

		Samosa samosa = context.getBean("samosa", Samosa.class);
		System.out.println(samosa);
		context.registerShutdownHook();
		System.out.println("*************************");
		Pepsi pepsi = context.getBean("pepsi", Pepsi.class);
		System.out.println(pepsi);

		System.out.println("***************************");
		Chicken chicken = context.getBean("chicken", Chicken.class);
		System.out.println(chicken);

	}

}

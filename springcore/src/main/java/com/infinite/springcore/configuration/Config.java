package com.infinite.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.infinite.springcore.configuration")
public class Config {
	
	@Bean("person")
	public Person getPerson() {
		Person person= new Person();
		return person;
	}

	@Bean
	public Laptop getLaptop() {
		Laptop laptop=new Laptop();
		return laptop;
	}
	@Bean
	public EmployeeBeanImplementation getEmployeeBeanImplementation() {
		EmployeeBeanImplementation employeeBeanImplementation=new EmployeeBeanImplementation();
		return employeeBeanImplementation;
	}
}

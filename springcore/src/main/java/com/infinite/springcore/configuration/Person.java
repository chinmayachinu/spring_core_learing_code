package com.infinite.springcore.configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	@Autowired
	private Laptop laptop;
	
	@Override
	public String toString() {
		return "Person [laptop=" + laptop + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Laptop laptop) {
		super();
		this.laptop = laptop;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void doRead() {
		System.out.println(" Yes I'm reading ");
		laptop.doCode();
	}
}

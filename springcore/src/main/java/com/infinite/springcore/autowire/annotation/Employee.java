package com.infinite.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setting values");
		this.address = address;
	}
	@Autowired
	public Employee(String name, Address address) {
		super();
		System.out.println("Inside constructor");
		this.name = name;
		this.address = address;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
}

package com.infinite.springcore.constructorinjection;

public class Person {

	private int id;
	private String name;
	private int age;
	private Address address;

	public Person(int id, String name, int age, Address address) {
		super();
		System.out.println("person constructor injection happened");
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}

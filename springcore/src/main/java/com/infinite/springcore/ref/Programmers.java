package com.infinite.springcore.ref;

public class Programmers {
	private String name;
	private Laptop laptop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Programmers(String name, Laptop laptop) {
		super();
		this.name = name;
		this.laptop = laptop;
	}
	public Programmers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Programmers [name=" + name + ", laptop=" + laptop + "]";
	}
	
}

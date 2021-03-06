package com.infinite.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("per")
@Scope("prototype")
public class Person {

	@Value(value = "2")
	private int id;
	@Value(value = "chinmaya")
	private String name;
	@Value(value = "#{list}")
	private List<String> languages;
	@Autowired
	private Laptop laptop;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", languages=" + languages + ", laptop=" + laptop + "]";
	}

	public Person(int id, String name, List<String> languages, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.languages = languages;
		this.laptop = laptop;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}

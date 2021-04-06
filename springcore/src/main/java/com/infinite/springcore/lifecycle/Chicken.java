package com.infinite.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chicken {
	//This is an example of annotation based life cycle configuration
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Chicken(int price) {
		super();
		this.price = price;
	}

	public Chicken() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void init() {
		System.out.println("Initialized");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}
	@Override
	public String toString() {
		return "Chicken [price=" + price + "]";
	}
	
}

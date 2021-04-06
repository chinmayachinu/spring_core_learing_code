package com.infinite.springcore.lifecycle;

public class Samosa {
	//This is an example of xml based life cycle configuration
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting the price");
		this.price = price;
	}

	public Samosa(int price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("Init method called");
	}
	public void destroy() {
		System.out.println("Destroy method called");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
}

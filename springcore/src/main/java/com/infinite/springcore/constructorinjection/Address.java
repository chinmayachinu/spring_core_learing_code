package com.infinite.springcore.constructorinjection;

public class Address {
	private String at;
	private String post;
	private long zip;

	public Address(String at, String post, long zip) {
		super();
		System.out.println("constructor injection");
		this.at = at;
		this.post = post;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [at=" + at + ", post=" + post + ", zip=" + zip + "]";
	}

}

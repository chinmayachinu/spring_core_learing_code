package com.infinite.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Value(value = "Dell")
	private String laptopName;

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String laptopName) {
		super();
		this.laptopName = laptopName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopName=" + laptopName + "]";
	}

}

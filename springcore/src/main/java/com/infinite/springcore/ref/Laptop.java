package com.infinite.springcore.ref;

public class Laptop {
	private int modelNumber;
	private String modelName;
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Laptop(int modelNumber, String modelName) {
		super();
		this.modelNumber = modelNumber;
		this.modelName = modelName;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Laptop [modelNumber=" + modelNumber + ", modelName=" + modelName + "]";
	}
	
}

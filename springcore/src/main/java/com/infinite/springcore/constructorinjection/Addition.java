package com.infinite.springcore.constructorinjection;

public class Addition {

	//This is an example to get clarified with the ambiguity problem
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		System.out.println("Integer constructor called");
		this.a = a;
		this.b = b;
	}
	
	public Addition(double a , double b) {
		System.out.println("Double constructor called");
		this.a= (int) a;
		this.b=(int) b;
	}
	
	public Addition(String a , String b) {
		System.out.println("String constructor called");
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
	}
	
	public void doSum() {
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("Addition = "+ (a+b));
	}
}

package com.infinite.springcore.autowire.annotation;

public class Address {
	private String at;
	private String post;
	private long zip;
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public Address(String at, String post, long zip) {
		super();
		this.at = at;
		this.post = post;
		this.zip = zip;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [at=" + at + ", post=" + post + ", zip=" + zip + "]";
	}
	

}

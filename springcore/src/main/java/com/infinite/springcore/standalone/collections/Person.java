package com.infinite.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private List<String> friends;
	private Map<String,String> languages;
	private Set<String> education;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, String> getLanguages() {
		return languages;
	}
	public void setLanguages(Map<String, String> languages) {
		this.languages = languages;
	}
	public Set<String> getEducation() {
		return education;
	}
	public void setEducation(Set<String> education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", languages=" + languages + ", education=" + education + "]";
	}
	public Person(List<String> friends, Map<String, String> languages, Set<String> education) {
		super();
		this.friends = friends;
		this.languages = languages;
		this.education = education;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

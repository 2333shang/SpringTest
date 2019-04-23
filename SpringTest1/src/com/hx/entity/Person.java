package com.hx.entity;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private String name;
	private Integer age;

	private List<String> cars;
	private Set<String> books;
	private Map<String,String> girls;
	
	public Person() {
		super();
		System.out.println("Person init");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, Integer age, List<String> cars, Set<String> books, Map<String, String> girls) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.books = books;
		this.girls = girls;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<String> getCars() {
		return cars;
	}
	public void setCars(List<String> cars) {
		this.cars = cars;
	}
	public Set<String> getBooks() {
		return books;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	public Map<String, String> getGirls() {
		return girls;
	}
	public void setGirls(Map<String, String> girls) {
		this.girls = girls;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + ", books=" + books + ", girls=" + girls
				+ "]";
	}
	
}

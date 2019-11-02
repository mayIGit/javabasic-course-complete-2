package com.busyqa.course.overriding;

public class Parent {

	String name;
	int age;
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
		
}

package com.busyqa.course.overriding;

/*
 * Overriding is a form of polymorphism because an object behaves in a 
 * different way.
 * 
 */

class Parent {

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

class Child extends Parent {
	
	public Child(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + "]";
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Child child = new Child("John",30);
		
		System.out.println(child.toString());		
	}
}

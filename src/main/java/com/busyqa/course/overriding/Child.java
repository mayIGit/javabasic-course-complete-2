package com.busyqa.course.overriding;

public class Child extends Parent {

	//Overriding is a form of polymorphism because an object behaves in a different way.
	
	public Child(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		Child child = new Child("John",30);
		
		System.out.println(child.toString());		
	}
}

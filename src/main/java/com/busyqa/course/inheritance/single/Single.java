package com.busyqa.course.inheritance.single;

/* 
 * Inheritance is an OOP concept where the properties and methods from one class 
 * (Parent, Base or SuperClass) are inherited by another class(Child, Derived, 
 * Sub Class). The goal is to reuse the code. 
 * 
 */

class Parent {

	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Parent [name=" + this.name + ", age=" + this.age + "]";
	}	
}

class Child extends Parent{
	
}

public class Single {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.setName("John");
		child.setAge(30);
		
		System.out.println(child.toString());
	}
}

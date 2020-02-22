package com.busyqa.course.inheritance.multi_level;

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
		return "Parent [name=" + name + ", age=" + age + "]";
	}	
}

class Child extends Parent{
	
}

class GranChild extends Child {

}

public class MultiLevel {

	public static void main(String[] args) {
		
		GranChild granChild = new GranChild();
		
		granChild.setName("John");
		granChild.setAge(30);
		
		System.out.println(granChild.toString());
	}
}

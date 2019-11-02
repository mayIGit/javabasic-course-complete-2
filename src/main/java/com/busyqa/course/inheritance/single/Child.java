package com.busyqa.course.inheritance.single;

public class Child extends Parent{
	
	/*Inheritance is an OOP concept where the properties and methods from one class (Parent, Base or SuperClass) are inherited
	  by another class(Child, Derived, Sub Class). The goal is to reuse the code. */
	
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.setName("John");
		child.setAge(30);
		
		System.out.println(child.toString());
	}

}

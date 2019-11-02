package com.busyqa.course.inheritance.multilevel;

public class GranChild extends Child {

	/*Inheritance is an OOP concept where the properties and methods from one class (Parent, Base or SuperClass) are inherited
	  by another class(Child, Derived, Sub Class). The goal is to reuse the code. */
	
	public static void main(String[] args) {
		
		GranChild granChild = new GranChild();
		
		granChild.setName("John");
		granChild.setAge(30);
		
		System.out.println(granChild.toString());
	}

}

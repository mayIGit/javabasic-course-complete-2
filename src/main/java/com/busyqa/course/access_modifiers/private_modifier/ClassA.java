package com.busyqa.course.access_modifiers.private_modifier;

@SuppressWarnings("unused")
public class ClassA {

	/* private members can only be accesible 
	   from within their own class;
	    
	   private access modifier cannot be used with a class*/ 
	private int member;
	
	private void doSomething() {
		System.out.println("Doing Something");
	}
}

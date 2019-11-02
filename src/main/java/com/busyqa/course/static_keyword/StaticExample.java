package com.busyqa.course.static_keyword;

public class StaticExample {
	
	// The keyword static indicates that the member belongs to the class and not to object.
	// In other words we can use the member without creating the actual object.
		
	String name;
	
	static int counter; /*An static variable is shared amongst all the objects of the class*/
	

	static String trimName() {
		return ""; //name.trim();  /* We are not able to access a non-static variable from a static method*/
	}

    int add2Numbers(int a, int b) {
		return a + b;
	}

	static int add3Numbers(int a, int b, int c) {
		
		return a + b + c;
	}

}

package com.busyqa.course.static_keyword;

class Clazz {
	
	/* 
	 * The keyword static indicates that the member belongs to the class and not 
	 * to the object.
	 * 
	 * In other words we can use the member without creating the actual object.
	 * 
	 */
		
	String name;
	
	/*
	 * An static variable is shared amongst all the objects of the class
	 */
	
	static int counter; 
	

	static String trimName() {
		return ""; 
		
		/* 
		 * We are not able to access a non-static variable from a static method
		 */	
		//name.trim(); 
	}

    int add2Numbers(int a, int b) {
		return a + b;
	}

	static int add3Numbers(int a, int b, int c) {
		
		return a + b + c;
	}

}

public class Static {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		/* 
		 * Since add3Numbers is a static method, we can execute it without 
		 * creating the actual object
		 */
		Clazz.add3Numbers(1,2,3); 

		/* 
		 * Since add2Numbers is a non-static method, we have to create the actual 
		 * object to execute it.
		 */

		Clazz obj1 = new Clazz();
		
		obj1.add2Numbers(1,2); 
		obj1.counter = 10;
		
		Clazz obj2 = new Clazz();
		obj2.counter = 20;
		
		/* 
		 * Since counter is a static instance variable, it belongs to the class 
		 * and not to an specific object. Said in other words, this instance variable 
		 * is going to be shared between all the objects instantiated from this class.
		 *
		 */
		
		System.out.println("Counter is " + obj1.counter);
	}

}


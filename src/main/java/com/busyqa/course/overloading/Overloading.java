package com.busyqa.course.overloading;


public class Overloading {

	/* 
	 * Overloading works on methods and contructors only.
	 * Overloading is a form of polymorphism because an object behaves in a 
	 * different way depending on the parameters.
	 * 
	 */	
	
	/*
	 * Variables
	 */
	
	int    a;
	String str;
	
	
	/*
	 * 1. Overloading the Constructor
	 */
	
	Overloading(){
		super();
	}
	Overloading(String str){
		this.str = str;
	}
	Overloading(int a){
		this.a = a;
	}
	Overloading(int a, String s){
		this.a = a;
		this.str = s;
	}
	
	
	/*
	 *  2. Overloading the Methods
	 */
	
	
	// Overloading by changing the type of the arguments. 
	String display(String s, int a) {
		return s + " " + a;
	}
	
	String display(int a, int b) {
		return a + " , " + b;
	}	
	
	// Overloading by changing the number of arguments. 
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	/*
	 *  3. Overloading the Main Method. (JVM will call the default main method)
	 */
	
	@SuppressWarnings("unused") /*Java Annotation*/ 
	public static void main(String[] args) {
		
		Overloading obj1 = new Overloading();
		
		Overloading obj2 = new Overloading("busyQA");
		Overloading obj3 = new Overloading(1,"busyQA");
		
		System.out.println(obj1.display("text",1));
		System.out.println(obj1.display(1,2));
		
		System.out.println(obj1.add(1,2));
		System.out.println(obj1.add(1,2,3));
	}
	
	public static void main() {
		
		Overloading obj1 = new Overloading();
		
		System.out.println(obj1.display("text",1));
		System.out.println(obj1.display(1,2));
	}
	
	
}

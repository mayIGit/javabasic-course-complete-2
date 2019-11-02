package com.busyqa.course.overloading;

public class OverloadExample {

	//Overloading works on methods and contructors only.
	//Overloading is a form of polymorphism because an object behaves in a different
	//            way depending on the parameters.
	
	
	// Variables
	
	int    a;
	String str;
	
	
	// 1. Overloading the Constructor
	
	OverloadExample(){
		super();
	}
	OverloadExample(String s){
		this.str = s;
	}
	OverloadExample(int a, String s){
		this.a = a;
		this.str = s;
	}
	
	
	// 1. Overloading the Methods
	
	
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
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		OverloadExample obj1 = new OverloadExample();
		OverloadExample obj2 = new OverloadExample("busyQA");
		OverloadExample obj3 = new OverloadExample(1,"busyQA");
		
		System.out.println(obj1.display("text",1));
		System.out.println(obj1.display(1,2));
		
		System.out.println(obj1.add(1,2));
		System.out.println(obj1.add(1,2,3));
	}
	
	public static void main() {
		
		OverloadExample obj1 = new OverloadExample();
		
		System.out.println(obj1.display("text",1));
		System.out.println(obj1.display(1,2));
	}
	
	
}

package com.busyqa.course.super_keyword;

public class Child extends Parent{

	String color = "child color";
	
	
    public Child() {
    	super();
    	System.out.println("Child Contructor"); // Super can be used to refer immediate parent constructor.
	}

	void displayColor() {
    	System.out.println(this.color);
    	System.out.println(super.color); // Super can be used to refer immediate parent variables.
    }
    
	@Override
	void doSomething() {
		System.out.println("Child Doing Something");
		super.doSomething(); // Super can be used to refer immediate parent methods.
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		
		child.displayColor();
		child.doSomething();
	}
}

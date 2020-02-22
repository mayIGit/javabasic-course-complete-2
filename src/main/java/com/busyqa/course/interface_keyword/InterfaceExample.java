package com.busyqa.course.interface_keyword;

interface InterfaceA {

	int data = 0; // Variables in Java interfaces by default are public, final and static. 
	
    void doSomething(); /* Methods in Java interfaces are public abstract or default;
                             An abstract method only have the signature (definition) but not the body. */
    
    default double findIncome(double grossSalary, double taxes) {
    	/* Java 8 has introduced default method to an interface in JDK 8. 
    	   This means that we can write our own default implementation to our interface methods.*/ 
    	return grossSalary - taxes;
    }
}

interface InterfaceB {

}

interface InterfaceC extends InterfaceA, InterfaceB{

}

class Parent {

}

public class InterfaceExample extends Parent implements InterfaceA, InterfaceB, InterfaceC{

	@Override
	public void doSomething() { 
		//Abstract methods from Interfaces must be implemented in the class.
		
		System.out.println("Child doing something");
	}

}

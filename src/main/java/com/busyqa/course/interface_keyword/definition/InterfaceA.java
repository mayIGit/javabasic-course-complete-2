package com.busyqa.course.interface_keyword.definition;

public interface InterfaceA {

	int data = 0; // Variables in Java interfaces by default are public, final and static. 
	
    void doSomething(); /* Methods in Java interfaces are public abstract or default;
                             An abstract method only have the signature (definition) but not the body. */
    
    default double findIncome(double grossSalary, double taxes) {
    	/* Java 8 has introduced default method to an interface in JDK 8. 
    	   This means that we can write our own default implementation to our interface methods.*/ 
    	return grossSalary - taxes;
    }
}

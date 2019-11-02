package com.busyqa.course.inheritance.hybrid;

public interface ParentB {

	int data = 0; // Variables in Java interfaces by default are public, final and static. 
	
    String findAddress(); // Methods in Java interfaces are public abstract or default;
    
    default double findIncome(double grossSalary, double taxes) {
    	/* Java 8 has introduced default method to an interface in JDK 8. 
    	   This means that we can write our own default implementation to our interface methods.*/ 
    	return grossSalary - taxes;
    }
	
}

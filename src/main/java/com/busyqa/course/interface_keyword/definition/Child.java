package com.busyqa.course.interface_keyword.definition;

public class Child extends Parent implements InterfaceA, InterfaceB{

	@Override
	public void doSomething() { 
		//Abstract methods from Interfaces must be implemented in the class.
		
		System.out.println("Child doing something");
	}

}

package com.busyqa.course.interface_keyword;

public class Child extends Parent implements InterfaceA, InterfaceB, InterfaceC{

	@Override
	public void doSomething() { 
		//Abstract methods from Interfaces must be implemented in the class.
		
		System.out.println("Child doing something");
	}

}

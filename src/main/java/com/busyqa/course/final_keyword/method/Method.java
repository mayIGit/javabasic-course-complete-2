package com.busyqa.course.final_keyword.method;

class Parent {

	final void doSomething() {
		System.out.println("Parent doing something!!!"); 
	}
}

class Child extends Parent {

	/*
	@Override
	void doSomething() { //Compilation Error: A final method cannot be overrided 
		System.out.println("Child doing something!!!"); 
	}*/
}

public class Method {

}

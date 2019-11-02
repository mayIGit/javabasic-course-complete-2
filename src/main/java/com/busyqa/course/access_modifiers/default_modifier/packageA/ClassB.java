package com.busyqa.course.access_modifiers.default_modifier.packageA;

class ClassB extends ClassA {

	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
		obj.a = 1; // "a" member of ClassA is visible from ClassB because both classes are in the same package.
		obj.doSomething(); // "doSomething() method is visible for the very same reason as the previous line."
	}
}

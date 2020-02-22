package com.busyqa.course.access_modifiers.default_modifier.property.same_package;

/* 
 * In the following example we can verify that ClassA is in fact visible because it
 * is public. ClassA is instantiated within the main method of ClassB. Also its 
 * properties (variables and methods) are visible because they are default.  
 */

class ClassB {
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
		obj.a = 1;
		obj.doSomething();
	}
}

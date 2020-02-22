package com.busyqa.course.access_modifiers.default_modifier.clazz.same_package;

/* 
 * The default access modifier is also know as package access modifier 
 * because it only allows visibility within the package.
 * 
 * Default access modifier can be used to the modify the scope of classes
 * and members.
 * 
 * ClassA is only visible from it's own package and not from outside the package.
 * 
 * In the following example we can verify that ClassA is visible and it's being
 * extended and also instantiated within the main method of ClassB 
 */

class ClassB extends ClassA {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ClassA obj = new ClassA();	
	}
}

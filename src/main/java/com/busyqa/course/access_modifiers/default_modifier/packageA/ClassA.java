package com.busyqa.course.access_modifiers.default_modifier.packageA;


/* Default access modifier is also know as package access modifier 
 * because it only allows visibility within the package.
 * 
 * Default access modifier can be used to the modify the scope of classes
 * and members.
 * 
 * ClassA is only visible from it's own package and not from outside.*/
class ClassA {

	int a = 1;
	
	void doSomething() {
		System.out.println("Doing Something");
	}
}

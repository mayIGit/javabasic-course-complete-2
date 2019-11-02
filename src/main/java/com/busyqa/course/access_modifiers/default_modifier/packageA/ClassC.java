package com.busyqa.course.access_modifiers.default_modifier.packageA;


/* Default access modifier is also know as package access modifier 
 * because it only allows visibility within the package.
 * 
 * Default access modifier can be used to the modify the scope of classes
 * and members.
 * 
 * ClassC is visible from outside its package because is public but its members are only 
 * visible from its own package because they are default*/
public class ClassC {

	int a = 1;
	
	void doSomething() {
		System.out.println("Doing Something");
	}
}

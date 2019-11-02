package com.busyqa.course.access_modifiers.protected_modifier.packageA;


/* 
 * Protected access modifier can only be used with class members not with classes.
 * It has the same visibility as Default access modifier with the addition that gives 
 * visibility outside the package through inheritance.
 * 
 * ClassA is only visible from it's own package and not from outside.*/
class ClassA {

	protected int a = 1;
	
	protected void doSomething() {
		System.out.println("Doing Something");
	}
}

package com.busyqa.course.access_modifiers.protected_modifier.packageA;


/* Protected access modifier can only be used with class members not with classes.
 * It has the same visibility as Default access modifier with the addition that gives 
 * visibility outside the package through inheritance.
 * 
 * ClassC is visible from outside its package because is public but its members are only 
 * visible from its own package and through inheritance because they are protected*/
public class ClassC {

	protected int a = 1;
	
	protected void doSomething() {
		System.out.println("Doing Something");
	}
}

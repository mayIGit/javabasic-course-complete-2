package com.busyqa.course.access_modifiers.protected_modifier.same_package;


/* 
 * The protected access modifier can only be used with class' members not with classes.
 * It has the same visibility as the default access modifier with the addition that gives 
 * visibility outside the package through inheritance.
 * 
 * In the following example ClassA's members are visible in the same package and 
 * in any other package through inheritance.
 */

public class ClassA {

	protected int a = 1;
	
	protected void doSomething() {
		System.out.println("Doing Something");
	}
}

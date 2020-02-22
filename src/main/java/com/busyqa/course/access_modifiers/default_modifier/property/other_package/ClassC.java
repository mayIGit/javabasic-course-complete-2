package com.busyqa.course.access_modifiers.default_modifier.property.other_package;

import com.busyqa.course.access_modifiers.default_modifier.property.same_package.ClassA;

@SuppressWarnings("unused")
class ClassC {
	
	public static void main(String[] args) {
		
		/*
		 * ClassA's properties are not visible in this package. They are visible 
		 * in their own package only because they have default access modifier. 
		 */

		ClassA obj = new ClassA(); 

		//obj.a = 1;
		//obj.doSomething();
	}

}

package com.busyqa.course.access_modifiers.default_modifier.clazz.other_package;

import com.busyqa.course.access_modifiers.default_modifier.clazz.same_package.*;

@SuppressWarnings("unused")
class ClassC {
	
	public static void main(String[] args) {
		
		/*
		 * Class A is not visible in this package. It is visible in it's own 
		 * package only because it has default access modifier. 
		 */

		//ClassA obj = new ClassA(); 
		
	}

}

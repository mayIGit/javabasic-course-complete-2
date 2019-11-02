package com.busyqa.course.access_modifiers.default_modifier.packageB;

import com.busyqa.course.access_modifiers.default_modifier.packageA.ClassC;

/* ClassA cannot be imported because it's not visible from it's package
import com.busyqa.course.access_modifiers.default_modifier.packageA.ClassA;
*/

class ClassD {
	
	public static void main(String[] args) {
		/* ClassC is visible because it's public but not it's members as they are default*/
		ClassC obj = new ClassC(); 
		
		/* //Members are not visible even though the class is
		obj.a = 5;
		obj.doSomething();*/
	}

}

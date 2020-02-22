package com.busyqa.course.access_modifiers.protected_modifier.other_package;

import com.busyqa.course.access_modifiers.protected_modifier.same_package.ClassA;


class ClassD extends ClassA{

	/* 
	 * The members inherited from classA are available in other packages through 
	 * inheritance only.
	 * 
	 */
	void verifyVisibility() {
		this.a = 5;
		this.doSomething();		
	}
}

class ClassC {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* 
		 * ClassA is visible because it's public but not its members as they are 
		 * protected. Members are only available in other packages through inheritance.
		 * 
		 */
		
		ClassA objA = new ClassA(); 
		//objA.a = 5;
		//objA.doSomething();		
	}

}

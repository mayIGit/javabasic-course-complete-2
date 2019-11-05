package com.busyqa.course.access_modifiers.protected_modifier.packageB;

import com.busyqa.course.access_modifiers.protected_modifier.packageA.ClassC;


class ClassD extends ClassC{
	
	
    void verifyVisibility() {
    	// These members inherited from C are visible because they are protected.
    	this.a = 5;
    	this.doSomething();
    }
	
	public static void main(String[] args) {
		/* ClassC is visible because it's public but not it's members as they are protected*/
		ClassC obj = new ClassC(); 
		
		
		/*//Members are not visible even though the class is
		obj.a = 5;
		obj.doSomething();*/
		
	}

}

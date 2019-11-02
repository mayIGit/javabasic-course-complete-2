package com.busyqa.course.access_modifiers.private_modifier;

@SuppressWarnings("unused")
public class ClassB {
	
	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
				
		/*//Private members are not visible from outside the Class.
		obj.member = 1;
		obj.doSomething();*/
	}

}

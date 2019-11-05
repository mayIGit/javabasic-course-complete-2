package com.busyqa.course.final_keyword.variable;

public class VariableExample {
	
	final int a = 4;
	
	void change(int a) {
		//this.a = a; /* Compilation Error. A final variable cannot be modified*/
		
		final int b;
		
		b=5;
//		b=7;
	}
	

}

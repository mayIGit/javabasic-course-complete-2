package com.busyqa.course.static_keyword;

public class StaticExecution {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		StaticExample.add3Numbers(1,2,3); /* Since add3Numbers is a static method, we can execute it without creating the actual object*/

		StaticExample obj1 = new StaticExample();
		obj1.add2Numbers(1,2); /* Since add2Numbers is a non-static method, we have to create the actual object to execute it.*/
		
		obj1.counter = 10;
		
		StaticExample obj2 = new StaticExample();
		obj2.counter = 20;
		
		
		System.out.println("Counter is " + obj1.counter);
	}

}

package com.busyqa.course.inheritance.hybrid;

public class ParentA {

	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}	
	
}

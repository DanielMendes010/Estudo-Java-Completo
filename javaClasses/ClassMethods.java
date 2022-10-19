package com.javaClasses;

public class ClassMethods {
	
	static void myMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	
	public void myStaticMethod() {
		System.out.println("Public method must be called by creating objects");
	}
	
	public static void main(String[] args) {
		myMethod();
		
		ClassMethods myObj = new ClassMethods();
		myObj.myStaticMethod();		
	}

}

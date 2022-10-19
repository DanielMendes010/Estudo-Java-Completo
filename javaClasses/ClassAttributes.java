package com.javaClasses;

public class ClassAttributes {
	final int i = 60; // The final keyword is useful when you want a variable to always store the same value (better know as constant), like PI (3.14159...)
	
	public static void main(String[] args) {
		MainObjects myObject = new MainObjects();
		System.out.println(myObject.x); // You can access attributes by creating an object of a class using the dot syntax(.)
		
		myObject.x = 40; // You can also modify the attribute values or override existing values
		
		System.out.println(myObject.x);
		
		
		
		ClassAttributes myObject2 = new ClassAttributes(); 
//		myObject2.i = 30; // i is now 30
		System.out.println(myObject2.i);
	}

}

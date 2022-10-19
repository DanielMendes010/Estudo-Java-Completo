package com.javaClasses;

// Abstract class
abstract class AbstractModifier {
	public String fname = "John";
	public int age = 24;
	public abstract void study(); //abstract method
}

// Subclass (inherit from AbstractModifier)
class Student extends AbstractModifier {
	public int graduationYear = 2018;
	public void study() { // the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
	
}

/* 
 Java Inheritance (Subclass and Superclass):
In Java, it is possible to inherit attributes and methods from one class to another. 
We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.

In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass)
 */
package com.javaClasses;

/*final*/ class JavaInheritance { // We called this class JavaInheritance because the theme, but we could call it any name we wanted (like Vehicle)
	protected String brand = "Ford"; // JavaInheritance attribute
	public void honk() { // JavaInheritance method
		System.out.println("Tuut, tuut!");
	}
}

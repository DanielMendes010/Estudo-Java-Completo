package com.javaClasses;

public class MultipleAttributes {
	String firstName = "Daniel";
	String lastName = "Mendes";
	int age = 24;
	
	public static void main(String[] args) {
		MultipleAttributes myObject = new MultipleAttributes();
		System.out.println("Name: " + myObject.firstName + " " + myObject.lastName);
//		System.out.println(" " + myObject.lastName);
		System.out.println("Age: " + myObject.age);
	}

}

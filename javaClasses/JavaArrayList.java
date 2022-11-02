/*
 Java ArrayList:
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
(if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added 
and removed from an ArrayList whenever you want. The syntax is also slightly different:
 */

package com.javaClasses;

import java.util.ArrayList; // import the ArrayList class

public class JavaArrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("For loop: " + cars.get(i));
		}
		
		for (String i : cars) {
			System.out.println("For-each loop: " + i);
		}
		
		System.out.println(cars);
		cars.set(0, "Opel");
		System.out.println(cars);
		System.out.println(cars.get(0) + ", " + cars.get(3));
		cars.remove(0);
		System.out.println(cars);
		System.out.println(cars.size());
		cars.clear();
		System.out.println(cars);
	}
}

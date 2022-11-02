/*
Java HashSet
A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

Add Items
The HashSet class has many useful methods. For example, to add items to it, use the add() method:

Check If an Item Exists
To check whether an item exists in a HashSet, use the contains() method:

Remove an Item
To remove an item, use the remove() method:
To remove all items, use the clear() method:

HashSet Size
To find out how many items there are, use the size method:
 */

package com.javaClasses;

import java.util.HashSet; // Import the HashSet class

public class JavaHashSet {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
		System.out.println(cars.size());
		System.out.println(cars.contains("Mazda"));
		cars.remove("Volvo");
		System.out.println(cars);
		cars.clear();
		System.out.println(cars);
		
		/*
		 Note: In the example above, even though BMW is added twice it only appears once in the set 
		 because every item in a set has to be unique.
		 */
	}

}

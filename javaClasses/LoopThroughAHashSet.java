/*
Loop Through a HashSet
Loop through the items of an HashSet with a for-each loop:
 */

package com.javaClasses;

import java.util.HashSet;

public class LoopThroughAHashSet {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		for (String i : cars) {
			System.out.println(i);
		}
	}

}

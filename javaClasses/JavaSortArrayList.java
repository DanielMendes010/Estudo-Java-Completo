package com.javaClasses;

import java.util.ArrayList;
import java.util.Collections; // Import the Collections class

public class JavaSortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList();
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		myNumbers.add(55);
		myNumbers.add(4);
		myNumbers.add(99);
		myNumbers.add(87);
		myNumbers.add(24);
		Collections.sort(myNumbers); // Sort cars
		for (int i : myNumbers) {
			System.out.println(i);
		}
	}

}

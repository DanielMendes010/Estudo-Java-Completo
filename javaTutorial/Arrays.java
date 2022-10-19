package com.javaTutorial;

public class Arrays {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// Change a array
		cars[2] = "Fiat";
		//Now outputs Fiat instead of Volvo
		System.out.println(cars[2]);
		System.out.println(cars.length);
	}

}

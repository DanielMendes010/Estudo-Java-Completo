package com.javaTutorial;

public class ForArray {
	public static void main(String[] args) {
		System.out.println("For:");
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + ", ");
		}
		System.out.println("\n");
		System.out.println("For-Each:");
		for (String i : cars) {
			System.out.print(i + ", ");
		}
	}

}

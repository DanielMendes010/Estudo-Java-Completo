package com.javaClasses;

public class MethodsWithObjects {
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	public void maxSpeed(int maxSpeed) {
		System.out.println("Max speed is: " + maxSpeed);
	}
	public static void main(String[] args) {
		MethodsWithObjects myCar = new MethodsWithObjects();
		myCar.fullThrottle();
		myCar.maxSpeed(200);
	}

}

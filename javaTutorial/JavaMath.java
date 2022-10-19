package com.javaTutorial;

public class JavaMath {
	public static void main(String[] args) {
		
		int randomNum = (int) (Math.random()*100);
		
		System.out.println("The value is: " + Math.max(5, 10));
		System.out.println("The value is: " + Math.min(50.70, 53.90));
		System.out.println("The value is: " + Math.sqrt(64));
		System.out.println("The value is: " + Math.abs(-4.7));
		System.out.println("The value is: " + Math.random());
		System.out.println("The value is: " + Math.random() *100);
		System.out.println("The value is: " + randomNum);
	}

}

package com.javaTutorial;

public class TypingCast {
	public static void main (JavaString[] args) {
		int myInt = 23;
		double myDouble = myInt;
		
		System.out.println("O resultado é: " + myDouble);
		
		double mySecondDouble = 540;
		int mySecondInt = (int) mySecondDouble;
		
		System.out.println("O resultado é: " + mySecondInt);
	}

}

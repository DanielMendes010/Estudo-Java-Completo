package com.javaClasses;

public class JavaInSwitchStatement2 {
	public static void main(String[] args) {
		JavaInSwitchStatement myVar = JavaInSwitchStatement.MEDIUM;

		switch (myVar) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}

	}
}

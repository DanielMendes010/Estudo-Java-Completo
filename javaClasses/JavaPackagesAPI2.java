package com.javaClasses;

//import package.name.Class; // Import a single class
//import package.name.*; // Import the whole package
//import java.util.*; // Import a whole package java.util
import java.util.Scanner; // Import class Scanner from package java.util

public class JavaPackagesAPI2 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		System.out.println("Enter username");
		userName = myObj.nextLine();
		
		System.out.println("Username is: " + userName);
	}

}

// This a example about Build-in Packages
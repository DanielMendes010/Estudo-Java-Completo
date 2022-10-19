/* 
 Java Packages & API
 
A package in Java is used to group related classes. Think of it as a folder in a file directory. 
We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API):
The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles 
website User-defined Packages (create your own packages)

The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes),
 or a whole package that contain all the classes that belong to the specified package.

To use a class or a package from the library, you need to use the import keyword

 */
package com.javaClasses; // This a Built-in Packages (packages from the Java API)

//import package.name.Class; // Import a single class
//import package.name.*; // Import the whole package
//import java.util.*; // Import a whole package java.util
import java.util.Scanner; // Import class Scanner from package java.util. This a User-defined Packages (create your own packages)

public class JavaPackagesAPI {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		System.out.println("Enter username");
		userName = myObj.nextLine();
		
		System.out.println("Username is: " + userName);
	}

}

package com.javaClasses;

import com.javaClasses.JavaEnumInsideClass.Level;

public class JavaEnums2 {
public static void main(String[] args) {
	JavaEnums myVar = JavaEnums.MEDIUM;
	System.out.println("Object of enum result: " + myVar + "\n");
	
//	Loop Through an Enum:
//	The enum type has a values() method, which returns an array of all enum constants.
//	This method is useful when you want to loop through the constants of an enum:
	for (Level myVar2 : Level.values()) {
		System.out.println("Loop Through an Enum: " + myVar2);
	}
}
}
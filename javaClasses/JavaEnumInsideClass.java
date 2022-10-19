/* 
 Enum inside a Class:
You can also have an enum inside a class
 */

package com.javaClasses;

public class JavaEnumInsideClass {
	enum Level {
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}

}

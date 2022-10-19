package com.javaClasses;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.LocalTime; // import the LocalTime class

public class JavaDates {
	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now(); // Create a date object
		System.out.println(myObj); // Display the current date
		
		LocalTime myObj2 = LocalTime.now();
		System.out.println(myObj2);
		
		LocalDateTime myObj3 = LocalDateTime.now();
		System.out.println(myObj3);
		
		
	}

}

/*
 Formatting Date and Time:
The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the 
ofPattern() method in the same package to format or parse date-time objects.
 */

package com.javaClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaFormatitngDateAndTime {
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateObj.format(myFormatterObj);
		System.out.println("After formatting: " + formattedDate);
	}

}

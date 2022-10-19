/* 
 Java User Input:
The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. 
In our example, we will use the nextLine() method, which is used to read Strings
 */

package com.javaClasses;

import java.util.Scanner;

class JavaUserInput {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		System.out.print("Enter username: ");
		userName = myObj.nextLine();
		
		System.out.println("Username is: " + userName);
	}

}

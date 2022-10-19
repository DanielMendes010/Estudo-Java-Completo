/* 
 Multiple Interfaces:
 To implement multiple interfaces, separate them with a comma
 */

package com.javaClasses;

class JavaMultipleInterfaces3 implements JavaMultipleInterfaces, JavaMultipleInterfaces2 {
	public void myMethod() {
		System.out.println("Some text...");
	}
	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}
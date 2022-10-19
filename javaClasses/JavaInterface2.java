/* 
 To access the interface methods, the interface must be "implemented" (kinda like inherited) by 
 another class with the implements keyword (instead of extends). The body of the interface method 
 is provided by the "implement" class 
 */

package com.javaClasses;

class JavaInterface2 implements JavaInterface{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}

}

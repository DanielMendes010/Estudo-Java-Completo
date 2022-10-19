package com.javaClasses;

public class MultipleObjects {
	int x = 80;

	public static void main(String[] args) {
		MultipleObjects myObject = new MultipleObjects();
		MultipleObjects myObject2 = new MultipleObjects();
		myObject2.x = 40;
		System.out.println(myObject.x);
		System.out.println(myObject2.x);
		
		
	}
}

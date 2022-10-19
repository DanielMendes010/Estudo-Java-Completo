/* 
 Static Inner Class:
An inner class can also be static, which means that you can access it without creating an object of the outer class
*/

package com.javaClasses;

class OuterClasses2 {
	int x = 10;
	
	static class InnerClass {
		int y = 5;
	}
}

public class JavaStaticInnerClasses {
	public static void main(String[] args) {
		OuterClasses2.InnerClass myInner = new OuterClasses2.InnerClass();
		System.out.println(myInner.y);
	}

}

/* 
 Private Inner Class:
Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, 
declare the class as private
 */

package com.javaClasses;

class OuterClasses {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
}

public class JavaPrivateInnerClasses {
	public static void main(String[] args) {
		OuterClasses myOuter = new OuterClasses();
		OuterClasses.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}

}

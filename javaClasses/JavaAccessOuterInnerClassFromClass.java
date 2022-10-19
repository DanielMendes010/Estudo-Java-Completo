/* Access Outer Class From Inner Class:
One advantage of inner classes, is that they can access attributes and methods of the outer class
*/

package com.javaClasses;

class OuterClasses3 {
	int x = 10;
	
	class InnerClass {
		public int myInnerMethod() {
			return x;
		}
	}
}

public class JavaAccessOuterInnerClassFromClass {
	public static void main(String[] args) {
		OuterClasses3 myOuter = new OuterClasses3();
		OuterClasses3.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.myInnerMethod());
	}

}

package com.javaClasses;

class JavaInheritance2 extends JavaInheritance {
	private String modelName = "Mustang";
	public static void main(String[] args) {
		JavaInheritance2 myFastCar = new JavaInheritance2();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}
}

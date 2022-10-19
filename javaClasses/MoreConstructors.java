package com.javaClasses;

public class MoreConstructors {
	int modelYear;
	String modelName;
	
	public MoreConstructors(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		MoreConstructors myCar = new MoreConstructors(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}

//Outputs 1969 Mustang

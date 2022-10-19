/*  The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

Get and Set
Private variables can only be accessed within the same class (an outside class has no access to it). 
However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.
 
 */

package com.javaClasses;

public class JavaEncapsulation {
	private String name;
	
	// Getter
	public String getName() {
		return name;
	}
	
	// Setter
	public void setName (String newName) {
		this.name = newName;
	}

}

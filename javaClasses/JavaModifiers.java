/* Access Modifiers = controls the access level
 for classes:
 public = The class is accessible by any another class
 default = The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
 
 for attributes, methods and constructors:
 public = The code is accessible for all classes
 private = The code is only accessible within the declared class	
 default = The code is only accessible in the same package. This is used when you don't specify a modifier.
 protected = The code is accessible in the same package and subclasses.
*/


package com.javaClasses;

public class JavaModifiers {
	
	public String fname = "John";
	private String lname = "Doe";
	protected String email = "john@doe.com";
	int age = 24;
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String newLname) {
		this.lname = newLname;
	}

		public static void main(String[] args) {
			final String lname2 = "Doe";
			JavaModifiers myObj = new JavaModifiers();
			System.out.println("Name: " + myObj.fname + " " + lname2 ); // + myObj.lname cannot be used because is a private attribute
			System.out.println("Email: " + myObj.email);
			System.out.println("Age: " + myObj.age);
			
//			myObj.setLname("Frank");
			
//			System.out.println("New example: "  + myObj.getLname()); // How to call a private attribute of class JavaModifiers 
		}
}



/* Non-Access Modifiers = do not control access level, but provides other functionality
   for classes:
   final = The class cannot be inherited by other classes
   abstract = The class cannot be used to create objects (To access an abstract class, it must be inherited from another class)
   
   for attributes, methods and constructors:
   final = Attributes and methods cannot be overridden/modified	
   static = Attributes and methods belongs to the class, rather than an object	
   abstract = Can only be used in an abstract class, and can only be used on methods. 
   The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
   transient = Attributes and methods are skipped when serializing the object containing them
   synchronized = Methods can only be accessed by one thread at a time
   volatile	= The value of an attribute is not cached thread-locally, and is always read from the "main memory"
 */

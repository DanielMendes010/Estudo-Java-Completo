/*Java HashMap
In the ArrayList chapter, you learned that Arrays store items as an ordered collection, 
and you have to access them with an index number (int type). 
A HashMap however, store items in "key/value" pairs, and you can access them by an index 
of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: 
String keys and Integer values, or the same type, like: String keys and String values 
Create a HashMap object called capitalCities that will store String keys and String values

Add Items
The HashMap class has many useful methods. For example, to add items to it, use the put() method:

Access an Item
To access a value in the HashMap, use the get() method and refer to its key:

Remove an Item
To remove an item, use the remove() method and refer to the key:

To remove all items, use the clear() method:

HashMap Size
To find out how many items there are, use the size() method:
*/

package com.javaClasses;

import java.util.HashMap;

public class JavaHashMap {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities.size());
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("England"));
		System.out.println(capitalCities.remove("England"));
		capitalCities.clear();
		System.out.println(capitalCities);
	}

}

package com.rays.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class collectionMethods {
	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(10);
		c.add(12);
		c.add(14);
		//clear method
		c.clear();

		Collection c1 = new ArrayList();
		c1.add("one");
		c1.add("two");
		//addAll Method
		c1.addAll(c);

		Collection c2 = new ArrayList();
		c2.add("silver");
		c2.add("Gold");
		c2.addAll(c1);
		System.out.println("All data :"+ c2);
		//contains method
		System.out.println("Contains commond :"+ c1.contains("one"));
		//containsAll mmethod
		System.out.println("ContainsAll : "+ c1.containsAll(c2));
		System.out.println("Empty :"+ c1.isEmpty());
		//remove
		c1.remove("one");
		System.out.println("After Remove :" + c1);
		c1.removeAll(c1);
		System.out.println("After RemoveAll" + c1);
		
		
		

	}

}

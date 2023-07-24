package com.rays.collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedList {
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		s.add("Rahul");
		s.add("sachin");
		s.add("ashu");
		s.add("ankit");
		s.add("Sourabh");
		s.add("Kapil");
		s.add("Adarsh");
	
		
		
	 for (Object o : s) {
		 System.out.println(o);
	 } System.out.println("First Elements :" + s.first());
	 System.out.println("Last Elements :" + s.last());
	 System.out.println(s.headSet("sachin"));
	 System.out.println("Display tail :"+ s.tailSet("Rahul"));
	 System.out.println("Display subset :"+ s.subSet("Kapil", "ashu"));
	}

}

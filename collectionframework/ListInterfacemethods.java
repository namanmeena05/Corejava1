package com.rays.collectionframework;

import java.util.ArrayList;

public class ListInterfacemethods {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(0, 104);
		a.add(1, 101);
		a.add(2, 102);
		a.add(3, "naman");
		a.add(4, "sachin");
		a.add(5," DK");
		System.out.println(a.get(2));
		System.out.println(a.remove(0));
		System.out.println(a);
		a.set(2, 102);
		System.out.println(a);
		System.out.println(a.subList(2, 4));	
		System.out.println(a.indexOf(102));
		System.out.println(a.lastIndexOf("sachin"));
		
		
	}

}

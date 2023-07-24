package com.rays.collectionframework;

import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		h.put("1" , "Yash");
		h.put(2, "sourabh");
		h.put(3, "ashu");
		h.put(4, "annu");
		System.out.println(h);
		System.out.println("Size of Map :"+h.size());
		System.out.println(h.put(3, "annu"));
		System.out.println(h.containsKey(2));
		System.out.println(h.containsValue("annu"));
		System.out.println(h.get(3));
		System.out.println("entry set"+h.entrySet());
		
		System.out.println(h.isEmpty());
		System.out.println(h.remove(2));
		
		System.out.println(h.keySet());
		h.clear();
		System.out.println(h.values());
	}

}

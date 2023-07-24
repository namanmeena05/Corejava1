package com.rays.equalsmethod;

public class TryPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person(01,"naman");
		Person p1 = new Person(01,"naman");
		
		System.out.println(p.equals(p1));
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		
	}

}

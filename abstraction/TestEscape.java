package com.rays.abstraction;

public class TestEscape {
	public static void main(String[] args) {
		
		System.out.println("hello    " + "\b"+ " java");
		
		for (int i = 0; i < 11; i++) {
			
			System.out.print(i + "\r");
			
		}
	}

}

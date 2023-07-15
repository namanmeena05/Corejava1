package com.rays.trycatchexception;

public class TestMultipleCatch {
	
	public static void main(String[] args) {
		
		try {String name = "Naman";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
	}  catch ( StringIndexOutOfBoundsException  | NullPointerException ex ){
		System.out.println(ex.getMessage());
		
	}
		}

}

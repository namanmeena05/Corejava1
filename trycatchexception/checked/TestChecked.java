package com.rays.trycatchexception.checked;

public class TestChecked {
	
	public static void main(String[] args) throws Checked {
		try {
			String name = "nasrullaganj";
			System.out.println(name.charAt(15));
			
		}catch(Exception e) {
			throw new Checked();
			
		}
	}

}

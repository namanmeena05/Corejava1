package com.rays.basic.string;

public class AccesssCharInString {
	public static void main(String[] args) {

		String firstName = "Tony";
		String secondName = "Stark";
		String fullName = firstName + secondName;

		for (int i = 0; i < fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}

	}

}

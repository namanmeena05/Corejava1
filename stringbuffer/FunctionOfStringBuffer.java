package com.rays.stringbuffer;

public class FunctionOfStringBuffer {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("naman");
		//System.out.println(name.reverse());
		System.out.println(name.length());
		System.out.println(name.capacity());
		System.out.println(name.charAt(2));
		System.out.println(name.replace(2,5,"angh"));
	}

}

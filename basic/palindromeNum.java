package com.rays.basic;

public class palindromeNum {
	public static void main(String[] args) {
		int n = 171;
		int r;
		int sum=0;
		int number =n;
		while(n>0) {
			
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
			
		}if(number==sum) {
			System.out.println("Number is palindrome");
		}
	}
	

}

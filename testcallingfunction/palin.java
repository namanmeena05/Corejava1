package com.rays.testcallingfunction;

public class palin {
	
	public static int pldm(int n) {

		
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
		return number ;
	
	
	}

}

package com.rays.testcallingfunction;

public class Arms {
	
	public static int armst(int number) {

		int n,rem,sum=0;
		n=number;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}if(number==sum) {
			System.out.println("Number is armstronge");
		}else {
			System.out.println("Number is not armstronge");
		}
	
		return 0;
		
	}

}

package com.rays.basic;

public class ArmstrongeNum {
	public static void main(String[] args) {
		int number=153,n,rem,sum=0;
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
	}

}

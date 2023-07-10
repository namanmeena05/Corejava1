package com.rays.basic;

public class ReverseNum {
	public static void main(String[] args) {
		int n=7843;
		int r;
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
			
		}
	}

}

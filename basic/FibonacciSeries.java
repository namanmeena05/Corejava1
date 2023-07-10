package com.rays.basic;

public class FibonacciSeries {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int n = 10;
		int temp=0;
		System.out.print(temp + " ");
		for (int i = 0; i <= n; i++) {
			temp = first + second;
			
			System.out.print(temp +" ");
			
			second = first;
			first = temp;

		}
	}

}

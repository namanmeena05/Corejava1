package com.rays.basic;

public class HarmonicSeries {
	public static void main(String[] args) {
		int n = 5;
		double result = 0.0;
		for (int i = n; i > 0; i--) {
			result = result + (double) 1 / i;
			System.out.println(result + " ,");

		}
	}

}

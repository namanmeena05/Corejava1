package com.rays.basic;

public class PrimeNum1to100 {
	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}

			if (count == 0) {
				System.out.println(i);
			}

		}
	}

}

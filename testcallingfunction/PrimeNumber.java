package com.rays.testcallingfunction;

public class PrimeNumber {
	
	public static int pn(int n) {


	int temp = 0;
	for (int i = 2; i <= n - 1; i++) {

		if (n % i == 0) {
			temp = temp + 1;
		}
	}
	if (temp == 0) {
		System.out.println("Prime Number");

	}
	return 0;

	}

}

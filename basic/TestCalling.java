package com.rays.basic;

public class TestCalling {
	public static void main(String[] args) {
		//int n = sumnum(10,19);
		//System.out.println(n);
	System.out.println(sumnum(1,1));
	System.out.println(primenum(5));
	}


public static int sumnum (int a, int b ) {
	int c = a+b;
	return c;
}
public static int primenum(int n) {
	
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

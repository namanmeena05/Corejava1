package com.rays.arrayprogram;

public class MissingNum {
	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5, 8 };
		int[] B = { 1, 2, 4, 5, 8 };
		int sumA = 0;
		for (int num : A) {
			sumA = sumA + num;
		}
		int sumB = 0;
		{
			for (int num : B) {
				sumB = sumB + num;
			}
		}
		int array = sumA - sumB;
		System.out.println(array);
	}

}

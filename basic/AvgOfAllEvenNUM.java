package com.rays.basic;

public class AvgOfAllEvenNUM {


		public static void main(String[] args) {
			int n = 10 ;
			int sum = 0;
			int avg;
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
					count++;
				}
			}
			avg = sum / count;
			System.out.println("Average of sum of all odd number  " + avg);

		}

	}




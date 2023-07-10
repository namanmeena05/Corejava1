package com.rays.basic;

public class arms2 {
	    public static void main(String[] args) {
	        for (int number = 100; number <= 1000; number++) {
	            if (isArmstrong(number)) {
	                System.out.println(number);
	            }
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, 3); // assuming Armstrong numbers are 3-digit numbers
	            number /= 10;
	        }

	        return sum == originalNumber;
	    }
	}



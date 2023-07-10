package com.rays.arrayprogram;

public class SecondMax {
	    public static void main(String[] args) {
	        int[] arr = {5, 8, 2, 10, 3,5,33,44,23,12,23,32}; // Example array

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] < largest) {
	                secondLargest = arr[i];
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element.");
	        } else {
	            System.out.println("The second largest number is: " + secondLargest);
	        
	    }
	}

}
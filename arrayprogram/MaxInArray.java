package com.rays.arrayprogram;

public class MaxInArray {

	public static void main(String[] args) {
		int arr[] = {21,2,44,54,72,1,23,56,34,21};
		int a=0;
		for(int i =1; i<arr.length;i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
		
		}System.out.println("Maximum value "+ a);
	}


}

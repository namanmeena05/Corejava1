package com.rays.arrayprogram;

public class MinValuesofArray {


		public static void main(String[] args) {
			int arr[] = {21,27,44,54,72,10,23,56,34,21};
			int a=arr[0];
			for(int i =1; i<arr.length;i++) {
				if(a>arr[i]) {
					a=arr[i];
				}
			
			}System.out.println("Min value "+ a);
		}


	}




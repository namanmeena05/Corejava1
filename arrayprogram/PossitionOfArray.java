package com.rays.arrayprogram;

public class PossitionOfArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8,9};
		int b =10;
		int Index = -1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b) {
				Index=i;
			}
			}
			
		System.out.println(Index);
	}
}


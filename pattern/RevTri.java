package com.rays.pattern;

public class RevTri {
	
	public static int rtr(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
			
		}
		return n;
		
	}

}

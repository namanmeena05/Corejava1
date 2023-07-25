package com.rays.arrayprogram;

public class tableArray {
	public static void main(String[] args) {

		int table[][] = new int[10][10];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				int m = i + 2;
				int n = j + 1;
				table[i][j] = m * n;
			}

		}
		for (int[] i : table) {
			for (int j : i) {
				System.out.print(j + "\t");
			}

			System.out.println();
		}
	}

}

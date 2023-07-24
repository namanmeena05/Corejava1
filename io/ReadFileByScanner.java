package com.rays.io;

import java.io.FileReader;
import java.util.Scanner;

public class ReadFileByScanner {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\player.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		sc.close();
		file.close();
	}

}

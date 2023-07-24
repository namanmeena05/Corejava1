package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrite {
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\player.txt");
		PrintWriter out = new PrintWriter(System.out);
		for(int i=0;i<=5;i++) {
			out.write("Badshah");
		out.println("yo  yo  honey  singh");
			
		}out.close();
		file.close();
		System.out.println("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\player.txt");

	}
}

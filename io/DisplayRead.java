package com.rays.io;


import java.io.FileReader;

public class DisplayRead {
	
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\player.txt");

		int i = file.read();

		while (i != -1) {

			System.out.print((char)i);
			i=file.read();
		}

		file.close();
	}

}

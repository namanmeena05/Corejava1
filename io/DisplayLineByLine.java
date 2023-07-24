package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayLineByLine {
	
	public static void main(String[] args) throws Exception{
		
		FileReader  file =  new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\player.txt");
		BufferedReader buf = new BufferedReader(file);
		String str = buf.readLine();
		while(str !=null) {
			System.out.println(str);
			str = buf.readLine();
			
		}
		buf.close();
		file.close();
		
	}

}

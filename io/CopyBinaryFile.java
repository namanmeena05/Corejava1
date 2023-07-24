package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFile {
	public static void main(String[] args) throws IOException {
		
	FileInputStream in = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\mywebsite\\train.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\train.jpg");
		char ch = (char) in.read();
		while(ch != -1) {
			out.write(ch);
			ch = (char) in.read();
		}
		out.close();
		in.close();
	}

}

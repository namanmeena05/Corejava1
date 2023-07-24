package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {

		FileWriter write = new FileWriter("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\Hello.txt");
		write.write("hey brother "+"\n");
		write.write("hey brother");
		write.close();
	}

}

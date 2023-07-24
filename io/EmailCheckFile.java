package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EmailCheckFile {

	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\New folder\\gmail.txt");
		BufferedReader file = new BufferedReader(in);
		PrintWriter out = new PrintWriter("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\New folder\\Email2.txt");
		String line = file.readLine();

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		while (line!=null) {
			if (line.matches(emailreg)) {
				System.out.println(line);
				out.println(line);
			} else {
				System.out.println("Invalid email format: " + line);
			}
			line = file.readLine();
		}

		out.close();
		in.close();
	}

}

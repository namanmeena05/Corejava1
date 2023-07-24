package com.rays.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class EmailCheckConsole {

	public static void main(String[] args) throws Exception {

		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\New folder\\Email.txt"));
		String line = in.readLine();

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$";

		while (!line.equals("q")) {
			if (line.matches(emailreg)) {
				out.println(line);
			} else {
				System.out.println("Invalid email format: " + line);
			}
			line = in.readLine();
		}

		out.close();
		in.close();
	}

}

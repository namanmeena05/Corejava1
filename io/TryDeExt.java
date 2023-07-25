package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TryDeExt {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\employee.txt");
	
		ObjectInputStream in = new ObjectInputStream(file);
		
	Employee e = (Employee) in.readObject();
	System.out.println(e.addr);
	System.out.println(e.id);
	System.out.println(e.name);
	System.out.println(e.salary);
	
	in.close();
	file.close();
		
	}

}

package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\New folder\\normal.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		
		MarkSheet m = new MarkSheet();
		m.id=01;
		m.name="naman";
		m.maths=97;
		m.chemistry=90;
		m.physics=85;
		m.total=m.chemistry+m.maths+m.physics;
		
		obj.writeObject(m);
		System.out.println(m.name);
		System.out.println(m.total);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.physics);
		obj.close();
		out.close();
		
		
		
	
	}

}

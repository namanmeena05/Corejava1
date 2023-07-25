package com.rays.io;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmpExternalizable {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\io\\employee.txt");

		ObjectOutputStream obj = new ObjectOutputStream(file);

		Employee e = new Employee();

		e.id = 1;
		e.name = "vikash";
		e.addr = "chapda";
		e.salary = 1000;

		obj.writeObject(e);

		obj.close();
		file.close();
	}

}

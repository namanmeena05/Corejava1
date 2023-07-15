package com.rays.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonMain {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String str = "11/11/2023";

		Person p = new Person();
		p.setName("Naman");
		System.out.println(p.getName());
		p.setDob(sdf.parse(str));
		System.out.println(sdf.format(p.getDob()));
		p.setAddr("Indore");
		System.out.println(p.getAddr());
		System.out.println(p.AVG_AGE);
	}

}

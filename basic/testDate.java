package com.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = new String();
		str = sdf.format(d);
		
		System.out.println(str);
	}
}

package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateToStr {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//String str = sdf.format(d);
		//String str1 = "22/12/1999";
		//Date d1 = sdf.parse(str1);
		//System.out.println(d1);
		System.out.println(sdf.format(d));

	}
}
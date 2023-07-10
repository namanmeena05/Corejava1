package com.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TestCal {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();

		cal.setTime(d);
		System.out.println(cal.getTime());
	}

}

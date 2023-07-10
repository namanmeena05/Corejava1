package com.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {

	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		for (int i = 0; i <= 12; i++) { 
			cal.add(Calendar.DATE , 12);
			System.out.println(cal.getTime());
			
		}
		
	}

}

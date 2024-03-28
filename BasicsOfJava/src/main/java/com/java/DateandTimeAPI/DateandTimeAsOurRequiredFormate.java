package com.java.DateandTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateandTimeAsOurRequiredFormate {
	
	public static void main(String[]args) {
		
		LocalDate date = LocalDate.now();
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.printf("%d-%d-%d ",dd,mm,yyyy);
		
		LocalTime time = LocalTime.now();
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
	}

}

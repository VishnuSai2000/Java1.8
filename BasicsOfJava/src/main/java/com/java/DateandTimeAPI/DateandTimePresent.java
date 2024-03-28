package com.java.DateandTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateandTimePresent {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}

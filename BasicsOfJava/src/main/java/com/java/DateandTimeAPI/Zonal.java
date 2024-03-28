package com.java.DateandTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zonal {
	public static void main(String[]args) {
		
		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt =ZonedDateTime.now(la);
		
		System.out.println(zt);
	}

}

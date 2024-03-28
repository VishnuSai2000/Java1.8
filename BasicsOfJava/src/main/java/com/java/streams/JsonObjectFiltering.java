package com.java.streams;

import java.util.List;

public class JsonObjectFiltering {
	
	public static void main(String[]args) {
		
		String str = "{\r\n"
				+ "  \"family\": [\r\n"
				+ "    {\r\n"
				+ "      \"relationship\": \"Self\",\r\n"
				+ "      \"accessClassification\": \"ALL\",\r\n"
				+ "      \"identifiers\": [\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"A\",\r\n"
				+ "          \"value\": \"lne34567\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"B\",\r\n"
				+ "          \"value\": \"0AE56BEAF9731231231231\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"C\",\r\n"
				+ "          \"value\": \"0AE56BEAF9731231231231\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"A\",\r\n"
				+ "          \"value\": \"0AE56BEAF9731231231231\"\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		System.out.println(str);
		
	}

}

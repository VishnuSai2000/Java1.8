package com.java.streams;

import java.util.ArrayList;

public class ForeachMethod {
	
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Hi");
		l1.add("Hello");
		l1.add("How was the Day");
		
		l1.stream().forEach(s->System.out.println(s));
		
		l1.stream().forEach(System.out::println);
}
}


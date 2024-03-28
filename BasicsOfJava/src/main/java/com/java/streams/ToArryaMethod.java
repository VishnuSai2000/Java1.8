package com.java.streams;

import java.util.ArrayList;

public class ToArryaMethod {
	public static void main(String[] args) {

	ArrayList<String> l1 = new ArrayList<String>();
	l1.add("Gas");
	l1.add("Cow");
	l1.add("Fat");
	l1.add("Apple");
	l1.add("Dog");
	System.out.println("The unsorted order of the list is " +l1);
	
	String[] array = l1.stream().sorted((i1,i2)->i1.compareTo(i2)).toArray(String[]::new);
	
	for (String x : array) {
		System.out.println(x);	
	}
}
}

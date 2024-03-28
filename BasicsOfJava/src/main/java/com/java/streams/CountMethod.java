package com.java.streams;

import java.util.*;

public class CountMethod {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(69);
		l1.add(8);
		l1.add(25);
		l1.add(48);
		l1.add(59);
		System.out.println(l1);
		
		Long count = l1.stream().filter(n->n>40).count();
		
		System.out.println("The numbers which are greater than 40 are : " + count);

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("Ramu");
		l2.add("Raghu");
		l2.add("Jai");
		l2.add("Vijay");
		l2.add("Shiva Ram");
		System.out.println(l2);
		
		Long countt = l2.stream().filter(n->n.length()>3).count();
		System.out.println("The Strings which are greater than three letters are : " + countt);
	}

}

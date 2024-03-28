package com.java.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l5 = new ArrayList<Integer>();
		l5.add(20);
		l5.add(30);
		l5.add(29);
		l5.add(50);
//		Collections.sort(l1);
		System.out.println(l5);
		
		List<Integer> l2 = l5.stream().filter(n-> n%2 ==0).collect(Collectors.toList());
		System.out.println("These are the Even numbers that are present in our list "+l2);
		
		List<Integer> l6 = l5.stream().map(n->n*2+1).collect(Collectors.toList());
		System.out.println(l6);
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Mango");
		l1.add("apple");
		l1.add("banana");
		l1.add("pine Apple");
		List<String> l4 = l1.stream().filter(n-> (n.equals("apple"))).collect(Collectors.toList());
		System.out.println(l4);
	}
}

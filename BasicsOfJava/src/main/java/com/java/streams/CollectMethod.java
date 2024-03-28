package com.java.streams;

import java.util.*;
import java.util.stream.Collectors;
public class CollectMethod {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(59);
		l1.add(90);
		l1.add(67);
		System.out.println(l1);
		
		List<Integer> l2 = l1.stream().filter(n->n>60).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3 = l1.stream().map(n-> n+5).collect(Collectors.toList());
		System.out.println(l3);
		
	}

}

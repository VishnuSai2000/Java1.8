package com.java.streams;

import java.util.*;
import java.util.stream.Collectors;
public class SortedMethod {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(69);
		l1.add(8);
		l1.add(25);
		l1.add(48);
		l1.add(59);
		System.out.println("Unsorted order of numbers :" +l1);
		
		List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("The Default sorted order of the elements is : " + l2);
		
		List <Integer> l3 = l1.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("The Customized sorted order of the elements is : " +l3);
		
			

}
}

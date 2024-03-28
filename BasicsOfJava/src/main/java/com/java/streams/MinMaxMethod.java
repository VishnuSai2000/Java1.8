package com.java.streams;

import java.util.*;
import java.util.stream.*;
public class MinMaxMethod {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(20);
		l1.add(0);
		l1.add(10);
		l1.add(25);
		l1.add(5);
		System.out.println("The unsorted order of the list is " +l1);
		
		Integer min = l1.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("The Min interger in the list is :"+min);
		
		
		Integer max = l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("The Min interger in the list is :"+max);
	}

}

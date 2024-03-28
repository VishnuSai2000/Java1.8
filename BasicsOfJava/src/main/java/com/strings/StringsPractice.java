package com.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StringsPractice {
	
	public static void main(String[] args) {
		String s1 = "Vishu";
		
		StringBuffer sb = new StringBuffer("StringBuffer");
		sb.delete(0, 7);
		System.out.println(sb);
	

	List<Integer> list1 = new ArrayList();
	list1.add(10);
	list1.add(20);
	list1.add(34);
	list1.add(17);
	System.out.println(list1);
	
	List<Integer> list2 = new ArrayList();
	for(Integer i: list1) {
		
		if(i>30) {
			list2.add(i);
			
		}
		System.out.println(list2);
		
	}
	List<Integer> finalList =list1.stream().filter(n -> n==20).collect(Collectors.toList());
	System.out.println(finalList);
	}
}

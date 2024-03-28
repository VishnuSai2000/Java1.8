package com.java.predicate;

import java.util.function.Predicate;
import java.util.*;

public class predicateExampleToRemoveNullValues {

	public static void main(String[] args) {
		String[] names = {"Vishnu","",null,"Sai", "Sindhu","Divya","Chaitanya", ""};
		
		Predicate<String> p = s-> s!=null && s.length()!=0;
		ArrayList<String> l = new ArrayList<String>();
		for(String s : names) {
			if(p.test(s)) {
				l.add(s);
			}
			
		}
		System.out.println(l);
	}
}

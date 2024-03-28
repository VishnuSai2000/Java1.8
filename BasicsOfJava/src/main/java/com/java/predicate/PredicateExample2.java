package com.java.predicate;

import java.util.function.Predicate;

public class PredicateExample2 {
	
	public static void main(String[] args) {
		
		String[] names = {"suman", "susanth", "sujatha", "sunetha", "Abrar", "Vijay"};
		Predicate<String>  k = c -> c.charAt(0) == 's';
		for(String s : names) {
			if(k.test(s)) {
				System.out.println(s);
			}
			
		}
	}

}

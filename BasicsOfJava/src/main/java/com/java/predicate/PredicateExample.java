package com.java.predicate;
import java.util.function.*;
import java.util.*;
public class PredicateExample {
	
	public static void main(String [] args) {
		Predicate<Integer>  p = I -> I>10;
		System.out.println(p.test(100));
		
		Predicate<String>  s = I -> I.length()>10;
		System.out.println(s.test("Vishnu sai"));
		
		Predicate<Collection> c = a -> a.isEmpty();
		ArrayList l1 = new ArrayList();
		l1.add("String");
		ArrayList l2 = new ArrayList();
		
		System.out.println(c.test(l1));
		
		System.out.println(c.test(l2));
		
		int[] x = {10,15,20,25,30,35,40,45,50,55,60,65,70};
		Predicate<Integer> p1 = I -> I>10;
		Predicate<Integer> p2 = I -> I%2 == 0;
		System.out.println("The numbers not Lessthan that 10 are");
		m1(p1.negate(),x);
		System.out.println("The even numbers in the array are:");
		m1(p2,x);
		System.out.println("The numbers less that 10 and also Even ");
		m1(p1.and(p2),x);
		System.out.println("The number that satisfy atleast one predicate condition are:");
		m1(p1.or(p2),x);

	}
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1 :x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
	
	

}

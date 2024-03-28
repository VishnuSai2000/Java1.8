package com.javabasic;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class Tests {


	public static void main(String[] args) {
//		String vi = "Hi Hello Vishnu";
//		String n1=vi.substring(0, 2);
//		String n2 = vi.substring(9, 14);
//		System.out.println(n1+n2);
	
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Ram");
		emp.add("vishnu");
		emp.add("raghu");
		
//		for(ArrayList name:emp) {
//			if(name=="Vishnu") {
				System.out.print(emp);
			}
//		}
		
//		String name= emp.stream().filter(s->s.startswith("v")).collect(Collectors.toList());
//		List name = emp.stream().filter(s->s.startsWith("v")).collect(Collectors.toList());
	}
//}

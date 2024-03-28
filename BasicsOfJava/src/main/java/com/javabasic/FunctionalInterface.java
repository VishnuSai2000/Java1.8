package com.javabasic;

import java.util.*;

interface FunctionalInterfaceT {
	public void m1(int a, int b);
}
class FunctionalInterface {
	public static void main(String[]args) {
		
		
		
	FunctionalInterfaceT i = (a,b)-> System.out.println("lamdba expression " + (a+b));
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number a:");
	int a= obj.nextInt();
	System.out.println("Enter the number b:");
	int b = obj.nextInt();
	
	i.m1(a,b);
}
}


package com.javabasic;

public interface FunctionalInterfaceTest {
	public void m1();
}
class test{	
	public static void main(String[]args) {
		FunctionalInterfaceTest i = ()-> System.out.println("lamdba expression");
	
		i.m1();
}
}

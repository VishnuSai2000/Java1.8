package com.strings;
//program to find REVERSE OF A STRING in a given string
public class ReverseOfString {
	
	public static void main(String[] args) {
		  String str= "Geeks for Geeks", outputstr="";
	        char ch;
	       
	      System.out.print("Original word: "+str);
	     
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        outputstr= ch+outputstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ outputstr);
	}

}

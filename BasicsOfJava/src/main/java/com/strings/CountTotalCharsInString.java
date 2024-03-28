package com.strings;
//program to find NUMBER OF SPACES in a given string
public class CountTotalCharsInString {
	
	public static void main(String[] args) {    
        String string = "The rose id red";    
        int count = 0;    
        String[] word = new String[100];
            
        //Counts each WORD    
        for(int i = 0; i < string.length(); i++) { 
        	//give the respective character in place of 'a'
            if(string.charAt(i) == ' ') 
                count++;    
        }    
            
        //Displays the total number of WORDS present in the given string    
        System.out.println("Total number of WORDS in a string: " + count);    
	}
}
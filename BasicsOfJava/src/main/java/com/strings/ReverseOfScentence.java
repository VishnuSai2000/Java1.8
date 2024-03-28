package com.strings;
//program to print REVERSE OF SCENTENCE OF A GIVEN STRING
public class ReverseOfScentence {
	
	public static void main(String[] args)
	{
		String input = "Geeks for Geeks";

		// getBytes() method to convert string
		// into bytes[].
		byte[] strAsByteArray = input.getBytes();

		byte[] result = new byte[strAsByteArray.length];

		// Store result in reverse order into the
		// result byte[]
		for (int i = 0; i < strAsByteArray.length; i++) 
		{
		result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		}
		System.out.println(new String(result));
	}
}
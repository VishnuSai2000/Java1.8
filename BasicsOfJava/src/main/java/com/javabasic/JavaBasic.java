package com.javabasic;

public class JavaBasic {
	public static void main(String[] args) {
	String str = "sai";
    char ch[]=str.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--) {
        rev+=ch[i];  
    }
    System.out.println(rev);
	}
	
}	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		int n=153;
//		int temp;
//		int rem;
//		int sum=0;
//        temp = n;
//        while (temp > 0){
//        rem = temp%10;
//        sum += Math.pow(rem,3);
//        temp = temp/10;
//        }  
//
//            if(sum == n)
//            System.out.println("The given number is Amstrong"+sum);
//         else
//            System.out.print("The Number is not an Amstrong"+sum);
//
//    }
//}

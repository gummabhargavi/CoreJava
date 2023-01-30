package com.java.infinite;

public class StringMethods {
	 
	public static void main(String[] args) {
		 
		String str1="Hello";
		String str2="Hello";
		
		str1.toUpperCase();   //immutable
		System.out.println(str1);
		
		String s=str1.toUpperCase(); //by creating new obj we can change lower to upper.
		System.out.println(s);
		
		String str3=new String("Hii");
		String str4=new String("Hii");
		
		str4.endsWith("hello");
		
		//here we can check wether the string is ending with same letter or not .like true(or) false.
		System.out.println(str4.endsWith("i"));
		
		
		//combines specified string at the end of this string
		String c=str4.concat("hello");
		System.out.println(c);
		
		
		/*compares the two given strings on the basis of the content of
		the string irrespective of the case (lower and upper) of the string*/
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
		
		
	  //this method returns the formatted string by given locale, format and arguments.	
	   String st=String.format("%d", 101);          //Integer
	   String st1=String.format("%s", "Bhargavi");  //String
	   String st2=String.format("%f", 101.00);
	   String st3=String.format("%x", 101);        // Hexadecimal value  
	   System.out.println(st);
	   System.out.println(st1);
	   System.out.println(st2);
	   System.out.println(st3);
	   

	}

}

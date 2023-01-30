package com.java.infinite;

public class JavaStrings {
	
	public static void main(String[] args) {
		
		// literals are created in string conistant pool.
		//str1 and str2 both are equal.
		String str1 = "Hello";
		String str2 = "Hello";
		
//		str1.replaceAll("Hello", "Hi");
//		System.out.println(str1);
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		// object is created in the heap memory arear.
		//str3 and str4 both are different.
		// conclusion : == will compare reference variable i.e. hashcodes are not real content
		String str3=new String("Hello");
		String str4=new String("Hello");
		
		str3.replaceAll("Hello", "Hi");
		System.out.println(str3);
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		// compare String
		if(str3.equals(str4)){
			System.out.println("str3 is equal to str4");
		}else{
			System.out.println("str3 is not equal to str4");
		}
		
		if(str3.compareTo(str4)==0){
			System.out.println("str3 compared to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
		//String methods
		String[] str = {"Sunitha", "Bhargavi", "sandhya"};
		int len = str.length;
		System.out.println("Length of str is: " +len);
		
		String str0 = "Sunitha, Bhargavi, sandhya";
		//System.out.println("str0 is: "+str0);
		int len1 = str0.length();
		System.out.println("Length of str is: " +len1);
		System.out.println(str0.charAt(0)+ ","+str0.charAt(len1-1));
	
	    str0.toUpperCase();
	    System.out.println("str0 after upper is :" +str0);//strings are immutable we can changes the variables
	  
	    String h=str0.toUpperCase();
	    System.out.println("Uppercase is :"+h);
	    
	    String s1 = str0.toUpperCase();
	    System.out.println("s1 is:" +s1);//string manuplating
	
	    //to check whether the string is there are not
	    if(str0.contains("Sunitha")){
	    	System.out.println("Sunitha is in the String");
	    }else{
	    	System.out.println("Sunitha is not in the String");
	    }
	    
	    //to print the char from give index position.
	    String s2=str0.substring(8);
	    System.out.println("s2 is:"+s2);
	    
	    String s3 = str0.replace("sandhya", "Kusuma");
	    System.out.println("s3 is:" +s3);
	    
	    char[] chArr = str0.toCharArray();
	    for(char ch : chArr){
	    	System.out.println(ch+" ");
	    }
	    System.out.println();
	    
	    String[] strArr=str0.split(",");
	    for (String s : strArr) {
	    	System.out.println(s.trim());	
		}
	    
	    //data during registration
	    String email="infinite@gmail.com";
	    String phone="9808976098";
	    String pass="password123";
	    
	    //validate the data from user
	    if(!email.isEmpty()){
	    	System.out.println("Email is Available");
	    	if(!email.contains("@")&& !email.contains(".")){
	    		System.out.println("But, Email is not a valid Email");
	    	}else{
	    		System.out.println("Email is a valid one !!");
	    	}
	    }else{
	    	System.out.println("please provide an Email");
	    }
	    
	    if(!phone.isEmpty()){
	    	System.out.println("phone Number is Available");
	    	if(phone.length()!=10){
	    		System.out.println("But, Phone Number is not a valid Email");
	    	}else{
	    		System.out.println("Phone Number is a valid one !!");
	    	}
	    }else{
	    	System.out.println("please provide a Phone Number");
	    }
	    
	    //String are Imutable
	    String string=new String("Hello");
	    string.concat("world"); // concatenates two strings
	    System.out.println("concat is :"+string);
	    
	    //by using stringbuffer we can manupulate two strings over here.
	    //String buffer is MUTABLE
	    StringBuffer buffer =new StringBuffer("Hello");//THREAD-SAFE
	    buffer.append("World");
	    System.out.println("buffer is:"+buffer);
	
	   //same as string buffer. 
	   StringBuilder builder =new StringBuilder("Hello");//NOT THREAD-SAFE
	   builder.append("World");
	   System.out.println("builder is :" +builder);
	
	   //run Time Polymorphism
	   CharSequence cs = null;
	   cs=new String("Hello");
	   cs=new StringBuffer("Wlcome To ");
	   cs=new StringBuilder("Infinite");
	   System.out.println(cs);
	   
	   //StringBuffer methods
	   StringBuffer sb=new StringBuffer("Hello");
	   sb.insert(5, "Java");
	   System.out.println(sb);
	   
	   StringBuffer sb1=new StringBuffer("Hi");
	   sb1.replace(2, 2, "java");
	   System.out.println(sb1);
	   
	   StringBuffer sb2=new StringBuffer("Hello");
	   sb2.delete(1, 3);
	   System.out.println(sb2);
	   
	   StringBuffer sb3=new StringBuffer("Hello");
	   sb3.reverse();
	   System.out.println(sb3);
	   
	   
	   StringBuffer sb4=new StringBuffer();
	   System.out.println(sb4.capacity());//defaul 16
	   sb4.append("Hello");
	   System.out.println("1:"+sb4.capacity());
	   sb4.append("Java is my favourite language");
	   System.out.println("2:"+sb4.capacity());//defaul 16
	   sb4.append("hi");
	   System.out.println("3:"+sb4.capacity());//defaul 16
	   sb4.append("vijay");
	   System.out.println("SB length."+sb4.length());
	   System.out.println("4:"+sb4.capacity());//now (16*2)+no.of chacters
	   
	}

}

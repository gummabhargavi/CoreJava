package com.java.infinite;

public class ArrayIndexOutEx1 {
	public static void main(String[] args) {
		String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
		          
		        for(int i=0;i<=arr.length;i++) {   //here arr.length is 4 but index is 3.    
		  
		             System.out.println(arr[i]);   // while printing index it throws an exception   
		        }  
	}

}

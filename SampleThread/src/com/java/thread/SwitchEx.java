package com.java.thread;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		String name;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name :");
		name=sc.nextLine();
		switch(name.length()){
		
		case 5:
		case 6:
	    case 7:
	    case 8:
	    case 9:
	    case 10:System.out.println("length is 5-10");
	    break;
	    default:System.out.println("length is not 5-10");
		}
		
//		for(int i=0;i<5;){  //infinite times hello will be printed
//			System.out.println("Hello");
//		}
		
//		for(int i = 0; i<5;i++)  //i=0,i=3,i=6 here termited
//		 {
//		 System.out.println("Hello");
//		 i+=2;
//		 }
		
//		for(int i = 0; i<5; i++)
//		 {
//		 System.out.println("Hello");  // hello will be printed 5 times
//		 i++;   //here this two operators deson't make any sense
//		 i--;
//		 }
		
		for(int i = 0; i<5; i++)
		 {
		 System.out.println("Hello"); //hello will be printed 1 time
		 break;
		 }
	}

}

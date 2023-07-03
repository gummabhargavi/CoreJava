package com.java.infinite;

import java.util.Scanner;

interface Student{
	public static void main1(){
		System.out.println("Hi");
	}

	}

class StaticEx  implements Student {
	
	public static void main(String[] args) {
		 String name;
		 int id;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter name");
		 name=sc.nextLine();
		 System.out.println("Enter id");
		 id=sc.nextInt();
		 
			Student.main1();
		
	}

	
	
}

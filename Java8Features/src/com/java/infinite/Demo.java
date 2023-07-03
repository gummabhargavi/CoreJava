package com.java.infinite;

import java.util.function.Function;
import java.util.function.Predicate;

interface Interf{   //Interface 
	public int square(int p1);
}

public class Demo {
	
	 static int square(int n){  //instated of writing a method and calling  we can use functions 
		return n*n;
		 
	 }

	public static void main(String[] args) {
		System.out.println("square of 4 is: "+square(4));
		System.out.println("square of 5 is: "+square(5));
		
		//RH side is lambda expression by writing this function we can decrees the lines of code 
		Function<Integer, Integer> f=i->i*i;
		System.out.println("square of 20 is: "+f.apply(20));
		System.out.println("square of 30 is: "+f.apply(30));	
		
		//predicate function will check whether the given number is even or not
		Predicate<Integer> p=i->i%2==0;
		System.out.println("given number is even or not: "+p.test(20));
		System.out.println("given number is even or not: "+p.test(73));	
		
		Interf f1=p1->p1*p1;   //using interface
		System.out.println(f1.square(80));
	}
}

package com.java.infinite;

interface A{
	
	default void m1(){
		System.out.println("Hello");
	}
}
interface B{
	
	default void m1(){
		System.out.println("Hi");
	}
}
class Test implements A,B{
	
	public void m1(){
		System.out.println("Welcome");
		A.super.m1();
		B.super.m1();
	}
}

public class DefEx {
      
	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
	}
}

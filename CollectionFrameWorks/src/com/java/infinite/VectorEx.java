package com.java.infinite;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
	
		v.add("hello");
		v.add("Bye");
		v.add("kumari");
		v.add("kumari");
		v.add("dog");
		v.add("Apple");
		
		for (String str : v) {
			System.out.println(str);
			
		}
	}

}

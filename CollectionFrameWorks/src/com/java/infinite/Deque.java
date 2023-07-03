package com.java.infinite;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque {
	public static void main(String[] args) {
		
		java.util.Deque<String> deque=new ArrayDeque<>() ;
		
		deque.add("Welcome");
		deque.add("To");
		deque.add("Infinite");
		
//		for (String str : deque) {
//			System.out.println(str);
//			
//		}
		Iterator<String> itr=deque.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

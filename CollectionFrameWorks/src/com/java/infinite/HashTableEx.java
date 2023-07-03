package com.java.infinite;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {
	
	public static void main(String[] args) {
		
		Hashtable<String,String> ht=new Hashtable<>(); //here if we use integer data type then it print high to low
		
		ht.put("a", "yellow");
		ht.put("b", "Green");
		ht.put("c", "pink");
		ht.put("d", "white");
		ht.put("e", "Red");
		ht.put("f", "null"); //null key and value will  not be allowed.
		
		System.out.println(ht);
		
		for (Map.Entry map: ht.entrySet()) {
			System.out.println(map);
		}
		
	}

}

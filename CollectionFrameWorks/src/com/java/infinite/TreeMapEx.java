package com.java.infinite;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<>();
		
		map.put(1, "Bhargavi");
		map.put(2, "Chandu");
		map.put(3, "Anu");
		map.put(4, "Huseen");
		map.put(5, "subbu");
		System.out.println(map);
		
		                   //NavigableMap Methods
		//TreeMap Class returns the least key greater than or equal to the given key or null if the such a key is absent.
		System.out.println("CeilingKey: "+map.ceilingKey(2)); 
	    System.out.println("ceiling Entry is: "+map.ceilingEntry(3));

		//is used to return the least key strictly greater than the given key, or null if there is no such key
		System.out.println("higherKey: "+map.higherKey(2));
		System.out.println("FloorKey: "+map.floorKey(2)); // returns the greatest key less than or equal to the given key
	    System.out.println("PollfirstEntry: "+map.pollFirstEntry());
	    System.out.println("PollLastEntry: "+map.pollLastEntry());
	    System.out.println("Desending order: "+map.descendingMap());
	    System.out.println("Desending keys are: "+map.descendingKeySet());
	    System.out.println("Entery set: "+map.entrySet());
	    
	    System.out.println(map);



	}

}

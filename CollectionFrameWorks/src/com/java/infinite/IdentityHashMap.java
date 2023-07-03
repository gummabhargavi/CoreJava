package com.java.infinite;

import java.util.Map;

public class IdentityHashMap {
	
	public static void main(String[] args) {
		
		Map map=new java.util.IdentityHashMap<Integer, String>();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		map.put(i1, "Bhargavi");
		map.put(i2, "Chandu");
		System.out.println(map);
	}

}

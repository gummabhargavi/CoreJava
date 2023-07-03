package com.java.infinite;

import java.util.HashMap;

public class WeakHashMap {
	public static void main(String[] args)  {
		
		//here if in cace we use hashmap it will not collect the garbage value
		java.util.WeakHashMap map= new java.util.WeakHashMap<Integer,String>(); //it can not print same element many times
		Integer i=new Integer(10);
		map.put(i, "Bhargavi");
		System.out.println(map);
		i=null;
	    System.gc();  //system will collect the garbage value
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(map);
	}

}

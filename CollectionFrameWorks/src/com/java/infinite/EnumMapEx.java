package com.java.infinite;

import java.util.EnumMap;
import java.util.Map;

import org.apache.catalina.tribes.tipis.AbstractReplicatedMap.MapEntry;

enum days1{
	Monday, Tuesday, Wednesday, Thursday  
}

public class EnumMapEx {
	public static void main(String[] args) {
		EnumMap<days1, String> em=new EnumMap<>(days1.class);
		
		em.put(days1.Monday, "1");
		em.put(days1.Thursday, "2");
		
		System.out.println("Size is:"+em.size());
		System.out.println("Copy is: "+em.clone());
		
		for (Map.Entry m:em.entrySet()) {
			System.out.println(m);
			
		}
		
	}

}

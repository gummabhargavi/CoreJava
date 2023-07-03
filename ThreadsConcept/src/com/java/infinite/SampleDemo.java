package com.java.infinite;

import java.util.HashMap;
import java.util.Map;

public class SampleDemo {
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(1, "Sunitha");
		m.put(2, "Sandhya");
		m.put(3, "Bhargavi");
		
		//System.out.println(m.keySet());
		
		for (Map.Entry m1:m.entrySet()) {
				
//			if(m1.getValue().equals("Sunitha")){
//				System.out.println(m1.getKey()+":"+m1.getValue());
//				
//			}
			if (m1.getKey().equals(2)&& m1.getValue().equals("Sandhya")){
				System.out.println(m1.getKey());
			}
			
		}
		
	}

}

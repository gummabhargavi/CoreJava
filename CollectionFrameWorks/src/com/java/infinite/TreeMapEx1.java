package com.java.infinite;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator{  //by using this we can provide our won customised sorting order

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}

public class TreeMapEx1 {
	
	public static void main(String[] args) {
		
		TreeMap<String, String> tm=new TreeMap<>();
		
		tm.put("b", "Dog");
		tm.put("a", "Cat");
		tm.put("c", "Pig");
		tm.put("E", "rabit");
		tm.put("d", null); //if in case key is null it through exception where as if value is null it doesnot through any exception
		
		System.out.println(tm);	
		
		TreeMap t=new TreeMap(new MyComparator());
		
		t.put("a", "Hi");
		t.put("b", "Hello");
		t.put("c", null);
		//t.put(10, "Welcome");
		System.out.println(t);
	}

}

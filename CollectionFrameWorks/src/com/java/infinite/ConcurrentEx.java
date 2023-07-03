package com.java.infinite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentEx {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("banana");
		list.add("Mango");
		list.add("Orange");
		list.add("Guava");
		
		System.out.println("Array elements are : ");
		
		for (String str : list) {
			System.out.println(str);
		}
		
		//synchronized(list){
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(str.equals("Mango")){
				//itr.remove();   //here by using iterator object we can avoid concurrent exception 
				list.set(1, "grapes");
				//list.add("Banana");
			 //list.remove(str);  // here concurrent exception is occured.
			}
		}
		//}
		
		
		System.out.println("\n Array elements are :");
		for (String str : list) {
			System.out.println(str);
		}
		
		//another way we can remove concurrent exception.
//		List<String> removeList=new ArrayList<>();
//		
//		for (String s : list) {
//			if(s.equals("banana")){
//				removeList.add(s);
//			}
//			
//		}
//		list.removeAll(removeList);
//		
//		System.out.println("\n Array elements are :");
//		for (String str : list) {
//			System.out.println(str);
//		}
	}

}

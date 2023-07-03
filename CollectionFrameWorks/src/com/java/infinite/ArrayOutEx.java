package com.java.infinite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayOutEx {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(23);
		list.add(34);
		list.add(90);
		
		System.out.println(list);
		
		
//		Iterator<Integer> itr=list.iterator();
//		while(itr.hasNext()){
//		int  i=itr.next();
//		System.out.println(i);
//		}
		
		Iterator<Integer> itr=list.iterator();
		for (int i = 0; itr.hasNext(); i++) {
			System.out.println("Index %d is "+i+" "+itr.next());
			 	
	      }
			
//		try {
//			int i1[]={90,20,30,67}; 
//			   System.out.println("Index of 5 is: "+i1[5]);
//		} catch (Exception e) {
//			System.out.println("Error: Exception was occured "+e);
//		}
		
		String[] arr={"Bhargavi","Sunitha","Sandhya"};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		}
	}



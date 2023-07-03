package com.java.infinite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPrg {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("The list are ");
		list.add("Bhargavi");  //Adding object in arraylist  
		list.add("chandu");
		
		Iterator<String> t=list.iterator();  //Traversing list through Iterator 
	    while(t.hasNext()){
	    	System.out.println(t.next());
	    }
	}

}

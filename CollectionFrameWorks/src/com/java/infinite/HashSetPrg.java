package com.java.infinite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetPrg {
	public static void main(String[] args) {
	
		//Here data is not added index approach
		//we got hascodes for elements which are being added
		//HashSet<String> hs=new HashSet<>();
		
		TreeSet<String> hs=new TreeSet<>(); // Data is uncorderd but it is alphabetically sorted
		hs.add("Kumari");
		hs.add("Apple");
		hs.add("Kiran");
		hs.add("Cat");
		hs.add("cat");
		hs.add("kanthara0");
		hs.add("kumari");
		hs.add("Kumar");
		hs.add("Bata");
		hs.add("Kumari");
		
		System.out.println("Size of the set is: "+hs.size());
		System.out.println("HashSet is "+hs);
		
		Iterator<String> itr=hs.iterator();
		while (itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
			//System.out.println(itr.next());

		}
		//System.out.println(itr.next());
	//hs.remove("Kumar");
	//  System.out.println("Set After removing Kumar is: "+hs);	
	if(hs.contains("Kumari")){
		System.out.println("yes");
		
	}else{
		System.out.println("No");
	}
	System.out.println("HashSet size is: "+hs.size());	
	}

}

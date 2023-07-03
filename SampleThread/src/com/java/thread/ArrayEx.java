package com.java.thread;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx {
	public static void main(String[] args) {
		int a[] ={1,4,6,7};
	
	    List<Integer> mylist = new ArrayList();
	    System.out.println(a);
	   System.out.println(mylist.add(5));
	    
	    System.out.println(mylist);
	    System.out.println(mylist.hashCode());
	}

}

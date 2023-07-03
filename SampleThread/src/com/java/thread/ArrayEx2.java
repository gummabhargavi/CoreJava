package com.java.thread;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx2 {
	
	public static void main(String[] args) {
	    List<Integer> mylist = new ArrayList();
	    mylist.add(-2);
	    mylist.add(-1);
	    mylist.add(0);
	    
	   // mylist.remove(0);
	    
	   System.out.print(mylist.size());
	    for(int i = 0; i<mylist.size(); i++){
	        mylist.remove(i);
	       System.out.print(mylist.size());
	    }
	    
	}

}

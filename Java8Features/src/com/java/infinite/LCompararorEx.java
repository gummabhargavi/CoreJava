package com.java.infinite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		if(i1<i2){
			return -1;
		}
		else if(i1>i2){
			return +1;
		}else{
			return 0;
		}
	}
	
}

public class LCompararorEx {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(29);
		list.add(10);
		list.add(0);
		list.add(98);
		System.out.println(list);
		Collections.sort(list, new MyComparator());
        System.out.println(list);		
		
	}

}

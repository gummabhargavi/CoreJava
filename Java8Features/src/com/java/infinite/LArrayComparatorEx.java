package com.java.infinite;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LArrayComparatorEx {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(30);
		l.add(17);
		l.add(12);
		l.add(32);
		l.add(8);
		l.add(78);
		l.add(7);
		System.out.println(l);
		
		/*for (int j = 0; j < l.size(); j++) {
			System.out.println("Jav6 feature.."+l.get(j));
			
		}*/
		
		
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		Predicate<Integer> p = n->(n < 30);
		
		l.stream().filter(p).forEach(System.out::println);
		
		
		
		List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
	}

}

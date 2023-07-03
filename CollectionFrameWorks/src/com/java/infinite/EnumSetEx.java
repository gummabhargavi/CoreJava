package com.java.infinite;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetEx {
	public static void main(String[] args) {
		
		Set<days> s=EnumSet.of(days.SATURDAY,days.SUNDAY);
		
		Set<days> s1=EnumSet.allOf(days.class);
		System.out.println("WEEK Days: "+s1);
		
		Set<days> s2=EnumSet.noneOf(days.class);
		System.out.println("WEEK Days: "+s2);
		
		Set<days> s3=EnumSet.copyOf(s1);
		System.out.println("Copy of Days: "+s3);


		
		Iterator<days> itr=s.iterator();
		while(itr.hasNext()){
			days d=itr.next();
			System.out.println(d);
		}
		
	}

}

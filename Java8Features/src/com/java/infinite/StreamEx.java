package com.java.infinite;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx {
      public static void main(String[] args) {
    	 
    	 //creating a stream 
        System.out.println("----Stream----"); 
		Stream<String> s=Stream.of("a","b","c");
		s.forEach(System.out::println);
		
		//Create a stream source
		System.out.println("----Collection----");
		Collection<String> c=Arrays.asList("Bhargavi","vijuluuuuuuu");
		Stream<String> s1=c.stream();
		s1.forEach(System.out::println);
		
		System.out.println("----list----");
		List<Integer> l=Arrays.asList(1,3,6,3,90,4);
		Stream<Integer> s2=l.stream();
		s2.forEach(System.out::println);
		
		System.out.println("----Hashset----");
		Set<Integer> set=new HashSet<>(l);
		Stream<Integer> s3=set.stream();
		s3.forEach(System.out::println);
		
		System.out.println("----String array----");
		String[] array={"kumar" ,"kiran","karthik","keerthi"};
		Stream<String> s4=Arrays.stream(array);
		s4.forEach(System.out::println);
	}
}

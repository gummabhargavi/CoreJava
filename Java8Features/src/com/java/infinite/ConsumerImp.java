package com.java.infinite;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class ConsumerImpl implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//     // System.out.println("Hi "+s);		
//	}
//	
//}

public class ConsumerImp {
     public static void main(String[] args) {
//		Consumer<String> c=new ConsumerImpl();
//		c.accept("Hello world");
		
//		Consumer<String> c=(s)-> System.out.println(s);
//		c.accept("Hello World");
		
		Consumer<String> c1=(s)-> System.out.println(s+"World");
		Consumer<String> c2=(s)-> System.out.println(s+"Java");
		c2.andThen(c1).accept("Hello");

		List<Integer> l=Arrays.asList(1,2,3,4,5,67,8);
		Consumer<Integer> c3=(t)-> System.out.println(t);
		l.forEach(c3);

	}
}

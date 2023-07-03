package com.java.infinite;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//class SuplierImpl implements Supplier<LocalDateTime>{
//
//	@Override
//	public LocalDateTime get() {
//		return LocalDateTime.now();
//	}
//	
//}


public class SuplierDemo {
	public static void main(String[] args) {
//		Supplier<LocalDateTime> s=new SuplierImpl();
//		System.out.println(s.get());
		
		// supplier method is used to supply some data to the calling function.
		Supplier<LocalDateTime> s=()-> LocalDateTime.now();  
		System.out.println(s.get());
	}

}

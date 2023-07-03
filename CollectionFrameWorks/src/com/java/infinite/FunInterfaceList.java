package com.java.infinite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunInterfaceList {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("One");
		
		list.forEach(new Consumer<String>() {  // Iterate arraylist using consumer

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
	}

}

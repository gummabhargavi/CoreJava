package com.java.infinite;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	
	String name;
	int id;
}

public class AlistPrg {
     public static void main(String[] args) {
    	 Student s=new Student();
    	 s.name="vina";
    	 s.id=1030240;
		
    	 //here we can store String data type
    	 ArrayList<String> list=new ArrayList<String>();
    	 
    	 //here we can store any type of data
    	 ArrayList list1=new ArrayList();
    	 
    	 list.add("Sunutha");
    	 list.add("Bhargavi");
    	 list.add("Sandhya");
    	 list.add("Sandhya");

    	 
    	 list1.add("hi");
    	 list1.add(2);
    	 list1.add(s);
    	 
    	 System.out.println("Size of the list:"+list.size());
    	 
    	 
    	 System.out.println("list is "+list);
    	 System.out.println("list1 is "+list1);
    	 
    	 //1.we can get the element from the data
    	 String s1=list.get(list.size()-1);
    	 System.out.println("index of list is "+s1);
    	 
    	 Object h=list1.get(1); //object is the parent of any type in java, so parent can point to any type
    	 System.out.println("index of list1 is "+h);
    	 
        //2.we can update the list
    	 list.set(1, "sravani");
    	 System.out.println("now updated list is "+list.set(1, "sravani")+"\n"+list);
    	 
       //3.we can remove also
      // we remove all the elements in the list we can write list.clear()	 
    	 list.remove(1);
    	 System.out.println("After removing the list is "+list);
    	 
    //4.we can search the list also.
    	 if(list.contains("Bhargavi")){
    		 System.out.println("yes");
    	 }else{
    		 System.out.println("No");
    	 }
    	 
    //5.iterate an array
    	 System.out.println("====Iterating an array by using for loop====");
    	 for(int i=0;i<list.size();i++)
    		 System.out.println(list.get(i));
    	 System.out.println("*******************");
    	
    	 System.out.println("====Iterating with Enhanced for loop====");
    	 for(String str : list)
    		 System.out.println(str);
    	 System.out.println("*******************");
     
    //6.Iterating with  iterator
    	 System.out.println(">>>Iterating with iterator<<<");
    	 Iterator<String> it=list.iterator();
    	 while(it.hasNext()){
    	    String str2=it.next();
    	    System.out.println(str2);
    	// System.out.println(it.next());
    	   if(str2.equals("sandhya")){
    		  it.remove();
    	   }else{
    		 System.out.println("not found");
    	   }
    	 }
         System.out.println("____________");
         System.out.println("list after the itaration is :"+list);
    	 
     }
}

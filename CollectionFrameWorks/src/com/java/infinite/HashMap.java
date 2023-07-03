package com.java.infinite;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {
       public static void main(String[] args) {
		
    	   Map<Integer, String> map=new java.util.HashMap<Integer, String>();
    	   
    	   map.put(1,"Bhargavi");
    	   map.put(2, "Chandu");
    	   map.put(null, "sandhya");
    	   map.put(null, "sunitha");
 
    	   
    	   System.out.println(map);
    	   
//    	   map.put(2, "Bhargavi");
//    	   System.out.println(map);
    	   
    	 //  Set kset=map.keySet();  //we can get all the keys which are present in the hashmap.
    	   System.out.println("Keys in the hashmap: "+map.keySet());
    	   
    	   Collection values= map.values(); //we can get all the values which are present in the hashmap
    	   System.out.println(values);
    	   
    	   System.out.println(map.containsKey(1)); //check whether the key is there are not.
    	   System.out.println(map.containsValue("Bhargavi"));
    	   
    	   Set set=map.entrySet();   //Converting to Set so that we can traverse
    	   Iterator itr=set.iterator();
    	   while(itr.hasNext()){
    	        //Converting to Map.Entry so that we can get key and value separately  
              Map.Entry entry=(Map.Entry)itr.next();
              System.out.println(entry);
             // System.out.println(entry.getKey()+" "+entry.getValue());
    	   }
    	   
    	   
    	   
    	       /* we can use above way  or below way */
    	  for (Map.Entry m : map.entrySet()) {
			System.out.println(m);
		} 
	}
}

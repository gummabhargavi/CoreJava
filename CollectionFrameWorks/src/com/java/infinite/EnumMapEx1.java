package com.java.infinite;

import java.util.EnumMap;

enum key{
	One,Two,Three
}

class Book{
	int id;
	String name,author,publisher; 
	
  Book(int id,String name,String author, String publisher){
	  this.id =id;
	  this.name=name;
	  this.author=author;
	  this.publisher=publisher;
	  
  }
}

public class EnumMapEx1 {
	public static void main(String[] args) {
		
	EnumMap<key, Book> em=new EnumMap<>(key.class);
	
	  // Creating Books
	Book b1=new Book(101,"Let us C","Dennis Ritchie","BPB");    
    Book b2=new Book(102,"Java","James Gosling","Mc Graw Hill");    
    Book b3=new Book(103,"Operating System","Galvin","Wiley"); 
    
    // Adding Books to Map 
    em.put(key.One, b1);
    em.put(key.Two, b2);
    em.put(key.Three, b3);
    
	} 

}

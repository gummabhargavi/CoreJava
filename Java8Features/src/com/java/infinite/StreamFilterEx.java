package com.java.infinite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	private int id;
	private String name;
	private float price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}


public class StreamFilterEx {
	public static void main(String[] args) {
		/*---------------------using if condition------------------------------*/
		System.out.println("***********Using if condition*************");
		List<Product> plist=new ArrayList<>();
		for(Product p:getProducts()){
			if(p.getPrice()>1200){
				plist.add(p);
			}
		}
		for (Product p: plist) {  
			System.out.println(p);
		}
		/*---------------------using Stream API filter------------------------------*/
		System.out.println("\n********Stream API*********");
		List<Product> list=getProducts()
				.stream().filter((product)-> product.getPrice()> 1200f)
				.collect(Collectors.toList());
        list.forEach(System.out::println);
       /*--------------------or we can use this methos also-------------*/  
//        getProducts()
//		.stream().filter((product)-> product.getPrice()> 1200f).forEach(System.out::println);
		
		/*---------------------using enhance method------------------------------*/
        System.out.println("\n******Using EnhanceMethod*****");
		for (Product p: getProducts()) {
			System.out.println(p);
		}
		
		/*---------------------using stream------------------------------*/
		System.out.println("\n*****Using Streams*****");
		List<Product> lp=getProducts();
		Stream<Product> sp=lp.stream();
		sp.forEach(System.out::println);
		
}
	public static List<Product> getProducts(){
		List<Product> l=new ArrayList<Product>();
		l.add(new Product(101, "HP LAPTOP", 1200));
		l.add(new Product(102, "DELL LAPTOP", 2500));
		l.add(new Product(103, "APPLE LAPTOP", 2000));
		l.add(new Product(104, "HP DESKTOP", 1500));
		return l;

	}

}

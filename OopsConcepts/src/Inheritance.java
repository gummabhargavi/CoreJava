//Textual representation how an object will look in the memory.
//whatever we write in class is in actual the property of object as we are describing the object
//if you want anything which should belong to class make it static.

class Product{
	//Attributes (state)
	//private int pid;
	int pid;
	String name;
	int price;
	
	//constructor
	Product(){
		System.out.println(">> Product Object Construted");
	}
	
	//Methods(Behavior)
	//To write data in product object we have this Method
	void setProductDetails(int pid,String name,int price){
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	// To read data From Product object
	void showProductDetails(){
		System.out.println("---Product Id :" +pid+"---");
		System.out.println("Name :\t"+name);
		System.out.println("Price :\t"+price);
		System.out.println("-------------------");
	}
	//Setter 
	void setPid(int pid){
		this.pid=pid;//this means reference to current object
		//LHS belongs to the object and RHS belongs to method
	}
	//Getter ,Setters are required when we attribute is marked as a private
	int getPid(){
		return pid;
	}
}
class Mobile extends Product{
	
	//Additional Attributes
	String os;
	int ram;
	int sdCardSize;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	//METHOD OVERLOADING
	void setProductDetails(int pid,String name,int price,String os,int ram,int sdCardSize){
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.os=os;
		this.ram=ram;
		this.sdCardSize=sdCardSize;
		System.out.println(">>Data Written in Product Object");
	}
	//OVERIDING
	void showProductDetails(){
		System.out.println("---Product Id :" +pid+"---");
		System.out.println("Name :\t"+name);
		System.out.println("Price :\t"+price);
		System.out.println("OS :\t"+os);
		System.out.println("RAM :\t"+ram);
		System.out.println("SDCard :\t"+sdCardSize);
		System.out.println("-------------------");
	}
}
public class Inheritance {
	
	//main is executed by JVM when my program will run!!
	public static void main(String[] args) {
		/*
		//Create an object : product
		Product prod=new Product();
		//product is not an object its a reference variable which holds the hascode of the object in hexadecimal notation
	//	System.out.println("product is: "+prod);//we get 15db9742 as a hasCode,so product is ref variable not an object
	 
		//writing data in object
		prod.setProductDetails(519, "iphoneX", 70000);
		
		//reading data from object
		prod.showProductDetails();
		 
		System.out.println();
		
		//lets write the data directly
		Product p=new Product();
		p.setPid(261); //if i marked the variable(Attribute) as private here it won't access.
		p.name="Nike Shoes";
		p.price=5500;
		p.showProductDetails();
	  */
		
		//requesting to get mobile object constructed
		Mobile mobile = new Mobile();
		
		mobile.setProductDetails(302, "iphonex", 70000);
		mobile.showProductDetails();
		
		mobile.setProductDetails(302, "handroid", 56700, "ios", 4,128);
		mobile.showProductDetails();
	}

}

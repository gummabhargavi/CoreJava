package com.java.infinite;

@FunctionalInterface
interface A{
	int say(int x);
	//void read();
	
	 default void sleep(){
		System.out.println("sleeping");
	}
}
class B implements A{

	@Override
	public int say(int x) {
		return x;	
	}

	
//	@Override
//	public void read() {
//      System.out.println("I'M reading");		
//	}
	
}

public class FunctionalInterfaceEx {
	public static void main(String[] args) {
		
		B b=new B();
		
		 A s = (int x) -> x * x ; //by using lambda expression we can implement the functional interface
		 int ans=s.say(5);
		 System.out.println("Mul is: "+ans);
		 
		b.sleep();
		//b.read();
		
	}

}

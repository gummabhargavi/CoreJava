package com.java.infinite;

class A2 extends Thread{
	public void run(){
		System.out.println("Started "+Thread.currentThread().getName());
		Thread.yield();
		System.out.println("Ended "+Thread.currentThread().getName());
	}
}

public class ExYield {
	public static void main(String[] args) {
		
		A2 a=new A2();
		Thread t1=new Thread(a,"1st Thread");
		A2 a1=new A2();
		Thread t2=new Thread(a1,"2nd Thread");
		
		t1.setPriority(4);
		t2.setPriority(8);
		
		t1.start();
		t2.start();
		
		//t1.yield(); //temperarly pass the execution
		
	}

}

package com.java.infinite;

class MyThread implements Runnable{

	@Override
	public void run() {
      System.out.println("Hi");		
	}
	
}

public class RunnableDemo {
	public static void main(String[] args) {
		Thread t=new Thread(new MyThread());
		t.start();
		
		Runnable r=()->{
			for (int i=0;i<5;i++) {
				System.out.println("I value is "+i);
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		
	}

}

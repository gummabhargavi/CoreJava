package com.java.infinite;

class person2 extends Thread{
	public void run(){
		System.out.println("person is running....");
		
	}
}

public class StartEx {
	public static void main(String[] args) {
		person2 p=new person2();
		//p.start(); // start() method of thread class is used to begin the execution of thread
	     p.run();
	}

}

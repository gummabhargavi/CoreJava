package com.java.infinite;

class Stu extends Thread{
	public void run(){
		for(int i=0;i<=5;i++)
			System.out.println("Thread1: "+i);
			
	}
}
class Stu1 extends Thread{
	public void run(){
		System.out.println("Thread 2");
	}
}
public class ExSuspend {
	
	public static void main(String[] args) {
		Stu s=new Stu();
		Stu1 s1=new Stu1();
		s.start();
		s1.start();
		System.out.println("Main Thread");
		//s.suspend();
		//s.resume();
		
	}

}

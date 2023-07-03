package com.java.infinite;

class Student extends Thread{
	int t=0;
	public void run() {
		synchronized(this){
			for(int i=0;i<=5;i++){
				System.out.println("values"+i);
			}
			this.notifyAll();
		}
		
	}
}
class Student1 extends Thread{ 
	public void run(){
		synchronized (this) {
			int i1=0;
			while(i1<5){
				System.out.println("values for thread2 is: "+i1);
				i1++;
			}
			this.notifyAll();
		}
		
	}
}

public class ExNotify {
	public static void main(String[] args) throws InterruptedException {
		Student s=new Student();
		Student1 s1=new Student1();
		s.start();
		s1.start();
		synchronized (s) {
			System.out.println("Main Thread");
		    s.wait();	//s.join();
			System.out.println("mainthread got notified");
			System.out.println(s.t);
		}
		//s.start();
	}

}

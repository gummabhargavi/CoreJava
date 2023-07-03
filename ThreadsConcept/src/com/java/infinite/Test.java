package com.java.infinite;

class MyThreads extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"\t"+"i= "+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Test {
	public static void main(String[] args) {
		MyThreads mt=new MyThreads();
		
		ThreadGroup g=new ThreadGroup("groupA");
		ThreadGroup g1=new ThreadGroup("groupB");
		
		Thread t1=new Thread(g,mt,"T1");
		Thread t2=new Thread(g,mt,"T2");
		Thread t3=new Thread(g,mt,"T3");
		Thread t4=new Thread(g,mt,"T4");
		
		Thread t5=new Thread(g1,mt,"T5");
		Thread t6=new Thread(g1,mt,"T6");
		
		t1. start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		g.setMaxPriority(Thread.MAX_PRIORITY);
		int activecount=g.activeCount();
		System.out.println("Activecount in g: "+activecount);
		g1.list();
		int ac=g1.activeCount();
		System.out.println("Activecount in g1: "+ac);
//		g.suspend();
//		g.destroy();
//		System.out.println(g.getName()+"is destroyed");
//		g.interrupt();
//	    g.resume();
	    System.out.println("The parent is: "+g.getParent().activeCount());


		
		
		
	}

}

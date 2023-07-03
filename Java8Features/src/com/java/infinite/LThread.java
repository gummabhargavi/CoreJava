package com.java.infinite;

//class MyRunnble implements Runnable{
//
//	@Override
//	public void run() {
//       
//		for(int i=0;i<10;i++){
//			System.out.println("child thread");
//		}
//	}
//	
//}

public class LThread {
	public static void main(String[] args) {  //main method is 1st thread
		
		Runnable m=()->{   //lambda Expression
			for(int i=0;i<10;i++){
				System.out.println("Child thread");
			}
		};
		
		
		//MyRunnble m=new MyRunnble();
		Thread t=new Thread(m);      //child thread is mainly used to execute run() method
		t.start();
		
		for(int i=0;i<5;i++){
			System.out.println("Main thread");      //main thread will execute this 
		}
		
	}

}

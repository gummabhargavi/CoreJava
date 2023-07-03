package com.java.infinite;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	private String message;
	
	public WorkerThread(String s){
		this.message=s;
	}

	@Override
	public void run() {
      System.out.println(Thread.currentThread().getName()+" start message: "+message);
     // processmessage();
      System.out.println(Thread.currentThread().getName()+"END");
	}

//	private void processmessage() {
//         try {
//			Thread.sleep(300);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//	}
	
}


public class TestThreadPool {
	public static void main(String[] args) {
		 ExecutorService ex = Executors.newFixedThreadPool(5); //creating a pool of 5 threads 
		//Class<Executor> ex=Executor.class;
		for(int i=1;i<10;i++){
			Runnable r=new WorkerThread(""+i);
			ex.execute(r);  //calling execute method of ExecutorService  
		}
		ex.shutdown();
		while(!ex.isTerminated()){
			System.out.println("Finished all threads");
		}
	}

}

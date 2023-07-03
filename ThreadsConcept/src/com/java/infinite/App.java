package com.java.infinite;

class MyTask{
	void executeTask(){
		for(int doc=1;doc<=10;doc++){
			System.out.println("@@Printing documents # "+doc +"-Printer 2");
		}
	}
}

//MyTask IS-A thread
//class MyTask extends Thread{
//	@Override
//	public void run(){
//		for(int doc=1;doc<=10;doc++){
//			System.out.println("@@Printing documents # "+doc +"-Printer 2");
//		}
//	}
//}
//


public class App {
	
	//main method represents main thread
	public static void main(String[] args) {
		
		//whatever we write in here will be executed by main thread
		//a thread always excute the jobs in a sequence
		System.out.println("**Aplication started**");
		
		MyTask mt=new MyTask();
		mt.executeTask();
		//mt.start(); //-> start method internally excutes the run method
		
		for(int doc=1;doc<=10;doc++){
			System.out.println("^^Printing documents # "+doc +"-Printer 1");
		}
		System.out.println("**Aplication Finished**");
	}

}

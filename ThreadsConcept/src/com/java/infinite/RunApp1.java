package com.java.infinite;

class A{
	
}

//class MyTask1 extends A,Thread{ ->java doesn't support multiple inheritance.
class MyTask1 extends A implements Runnable{	
	@Override
	public void run(){
		for(int doc=1;doc<=10;doc++){
			System.out.println("@@Printing documents # "+doc +"-Printer 2");
		}
	}
}

class YourTask implements Runnable{	
	@Override
	public void run(){
		for(int doc=1;doc<=10;doc++){
			System.out.println("&&Printing documents # "+doc +"-Printer 3");
		}
	}
}

public class RunApp1 {
	public static void main(String[] args) {
		
		System.out.println("**Aplication started**");

		Runnable r=new MyTask1();
		Thread task=new Thread(r);
		task.start();
	
//		Runnable yu=new YourTask(); (or) new Thread(new YourTask()).start();
//		Thread th=new Thread(yu);
//		th.start();
		
		Thread t=new Thread(new YourTask());
		t.start();
		
		for(int doc=1;doc<=10;doc++){
			System.out.println("^^Printing documents # "+doc +"-Printer 1");
		}
		System.out.println("**Aplication Finished**");
	
	}

}

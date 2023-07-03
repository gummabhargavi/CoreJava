package com.java.infinite;

//Asynchronization threads are run parallel

class Printer{
	void printDocument(int numOfCopies,String docName){
	  for(int i=1;i<=numOfCopies;i++){
		System.out.println("** Printing : "+docName+""+i);
		
	}
 }
}

class MyThread extends Thread{
	Printer pref; //Printer p=new Printer(); 
	 MyThread(Printer p1) {
		 pref=p1;
	}
	
	@Override
	public void run() {
		pref.printDocument(5, "MMIS.PDF");
		
	}
}

class YourThread extends Thread{
	Printer pref;    //Printer p=new Printer(); 
	YourThread(Printer p1) {
		pref=p1;
	}
	
	@Override
	public void run() { //run() method to perform an action for the thread.
		pref.printDocument(15, "Python.PDF");
		
	}
}
public class SynApp {
	
	//main is representing main thread
	public static void main(String[] args) {
		System.out.println("@@Application started ==");

//		int a=100/0;   //arthematic exception in main thread so we are calling main is a 1st thread
//		System.out.println(a);
		
		Printer p=new Printer();
		//p.printDocument(10, "java.pdf");
		
		// it will print separate thread
		//multiple threads are going to work in a single object
		MyThread mth=new MyThread(p); //Mythread is having reference to the printer object
		YourThread yt=new YourThread(p);
		
		mth.start();
		yt.start();
		System.out.println(">>Application finished...");
		
	}

}

package com.java.infinite;

//my using synchronized we are no need to put join for each method
class Printer1{
	//synchronized void printDocument(int numOfCopies,String docName){
	void printDocument(int numOfCopies,String docName){	
		for(int i=1;i<=numOfCopies;i++){ //specified no.of times it print the statement
			try {
				Thread.sleep(500); //temporarily pass the execution  
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("** Printing : "+docName+""+i);

		}
	}
}

class MyThread1 extends Thread{
	Printer pref; //Printer p=new Printer(); 
	MyThread1(Printer p1) {
		pref=p1;
	}

	@Override
	public void run() {
		synchronized (pref) {
			pref.printDocument(5, "MMIS.PDF");

		}

	}
}

class YourThread1 extends Thread{
	Printer pref;    //Printer p=new Printer(); 
	YourThread1(Printer p1) {
		pref=p1;
	}

	@Override
	public void run() {
		synchronized (pref) {
			//pref.printDocument(5, "Python.PDF");
		}
		pref.printDocument(10, "Python.PDF");

	}
}
public class SynApp1 {

	public static void main(String[] args) {
		System.out.println("@@Application started ==");

		Printer p=new Printer();
		//p.printDocument(10, "java.pdf");

		// it will print separate thread
		//multiple threads are going to work in a single object
		MyThread1 mth=new MyThread1(p);  //Mythread is having reference to the printer object
		YourThread1 yt=new YourThread1(p);

		mth.start();

		/*try {
				mth.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/


		yt.start();
		
		System.out.println(">>Application finished...");

	}

}

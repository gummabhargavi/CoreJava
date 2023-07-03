package com.java.infinite;

class Table{
	//int n;
	synchronized void printable(int n){
		for(int i=0;i<=5;i++){
			System.out.println(n*i);
		}
	}
}

public class SynEx {
	public static void main(String[] args) {
		Table t=new Table();
		
		Thread t1=new Thread(){
			public void run(){
				t.printable(5);
				
			}
		};
		t1.start();
	}

}

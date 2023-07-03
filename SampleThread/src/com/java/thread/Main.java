package com.java.thread;

public class Main {
	private int a;
	
	public Main(){
		int a=10;
	}
	public Main(int temp){
		a=-10;
	}
	
	public static void main(String[] args) {
		Main obj=new Main();
		System.out.println(obj.a);
	}

}

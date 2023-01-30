package com.java.lang;

class Animal {
	protected int a;
	private int b;
    int c;
	
	protected void animalSound() {
		System.out.println("The animal makes a sound");
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	Pig(){
		a=10;
		setB(20);
		c=30;
		System.out.println(a);
	}
}

public class AcessSpecifiers {
	public static void main(String[] args) {
		Pig p=new Pig();
		p.animalSound();
		//p.getB(); //it doesn't print any value it just read the value
		System.out.println(p.getB());

	}


}

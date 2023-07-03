package com.java.thread;

 class newthread extends Thread 
    {
	newthread()
        {
	    super("My Thread");
	    start();
	}
	public void run()
        {
	    System.out.println(this);
	    
	}
    }
    class multithreaded_programing
    {
        public static void main(String args[])
        {
        	newthread n=new newthread(); 
        	n.start();
        }
    }
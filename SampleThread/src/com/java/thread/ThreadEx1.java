package com.java.thread;

public class ThreadEx1 extends Thread{
	
		Thread t;
		ThreadEx1()
	        {
		    t = new Thread(this,"My Thread");
		    t.start();
		}
		public void run()
	        {
	            try
	            {
	                t.join();   
		        System.out.println(t.getName());
	            }
	            catch(Exception e)
	            {
	            System.out.print("Exception");
	            }
		}
	    }
	    class multithreaded_programing1
	    {
	        public static void main(String args[])
	        {
	            new newthread();        
	        }

}

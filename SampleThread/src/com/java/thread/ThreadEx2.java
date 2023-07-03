package com.java.thread;

public class ThreadEx2 extends Thread{
		Thread t1,t2;
		ThreadEx2()
	        {
		    t1 = new Thread(this,"Thread_1");
		    t2 = new Thread(this,"Thread_2");
		    t1.start();
		    t2.start();
		}

		public void run()
	        {
		    t2.setPriority(Thread.MAX_PRIORITY);	
		    System.out.print(t1.equals(t2));
	        }    
	    }

	    class multithreaded_programing2
	    {
	        public static void main(String args[])
	        {
	            new newthread();        
	        }
	    }



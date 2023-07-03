package com.java.thread;
 import java.io.*;
    class streams
    {
        public static void main(String[] args)
        {
            try
            {
	        FileOutputStream fos = new FileOutputStream("serial");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeFloat((float) 3.5);
	        oos.flush();
	        oos.close();
	    }
	    catch(Exception e)
            {
	        System.out.println("Serialization" + e);
                System.exit(0);
            }
	    try
            {
	        FileInputStream fis = new FileInputStream("serial");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	     // System.out.println(ois.read());
	        ois.close();
	        System.out.println(ois.available());	
	        //ois.close();
	    }
	    catch (Exception e)
            {
                System.out.print("deserialization");
	        System.exit(0);
	    }
        }
    }
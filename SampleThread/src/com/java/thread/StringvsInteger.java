package com.java.thread;

public class StringvsInteger {
	public static void gfg(String s)
    {    
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }
    public static void gfg(Integer i)
    {
        System.out.println("Integer");
    }
  
    public static void main(String args[])
    {
        gfg("Hi");
    }

}

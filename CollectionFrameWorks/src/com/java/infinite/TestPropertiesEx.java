package com.java.infinite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesEx {
	public static void main(String[] args) {
		
		Properties p=new Properties();
		
		try {
			FileInputStream fi=new FileInputStream("d:\\Training\\Sample\\CollectionFrameWorks\\resources\\user.properties");
			p.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(p);
	    
	    
	    String name=p.getProperty("1");
	    System.out.println(name);
	}

}

package com.java.infinite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FInPutEx {
	
	public static void main(String[] args) {
		
		File file=new File("D:\\Training\\Sample\\ThreadsConcept\\src\\com\\java\\infinite\\Test.java");
	    FileInputStream fin=null;
	    
	    try{
	    fin=new FileInputStream(file);
	    System.out.println("Total file size to read(in bytes): "+fin.available());
	    int content;
	    while((content = fin.read())!=-1){
	    	System.out.println((char)content);
	    }
	    }catch(IOException e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(fin!=null)
	    			fin.close();
	    	}catch(IOException ex){
	    		ex.printStackTrace();
	    	}
	    	
	    }
	}

}

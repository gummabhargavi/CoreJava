package com.java.infinite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutEx {
	
	
	public static void main(String[] args) throws IOException{
		File file=new File("d:\\File\\Char3.text");
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try{
			fin =new FileInputStream(file);
			fout =new FileOutputStream("d:\\File\\Test.text");
		    int content;
		    while((content = fin.read())!=-1){
		    	fout.write(content);
		    	System.out.println("file copied successfully..");
		    }
		}catch(IOException e){
			e.printStackTrace();
			
		}
		fin.close();
		fout.close();
		
	}

}

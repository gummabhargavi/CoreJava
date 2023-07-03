package com.java.infinite;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutEx {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout=new FileOutputStream("d:\\File\\Char4.text");
			BufferedOutputStream bout=new BufferedOutputStream(fout);  //internally store the data
			String s="Welcome to ODC";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();  //Flush() is a method that allows you to unload the stream. 
			bout.close();
			fout.close();
			System.out.println("Success..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

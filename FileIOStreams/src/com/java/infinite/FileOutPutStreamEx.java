package com.java.infinite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEx {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout=new FileOutputStream("d:\\File\\Char1.text");
			fout.write(20);
			fout.close();
			System.out.println("Success...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}

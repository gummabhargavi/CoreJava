package com.java.infinite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutCharEx {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout=new FileOutputStream("d:\\File\\Char3.text");
			String s="Welcome to infinite";
			byte[] b=s.getBytes();
			fout.write(b);
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

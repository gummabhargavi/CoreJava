package com.java.infinite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FoutEx {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout=new FileOutputStream("d:\\File\\Text1.txt");
			String s="Welcome to Claims Module";
			byte[] b=s.getBytes();
			fout.write(b);
			//fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success");
	}

}

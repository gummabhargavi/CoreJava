package com.java.infinite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInPutStreamEx {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("d:\\File\\Char_text.txt");
			int i=fin.read();
			System.out.println("the char1.text value is "+i);
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.java.infinite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileInPutCharEx {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("d:\\File\\Char3.text");
			char i=(char) fin.read();
			System.out.println("the char3.text is "+i);
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

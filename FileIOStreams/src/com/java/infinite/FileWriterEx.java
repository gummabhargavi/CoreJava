package com.java.infinite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("d:\\File\\filewriter.txt");
			fw.write("Hello Bnglr");
			fw.close();     //if we are not cosing the file that character is not storing into ur file.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("successful...");
	}

}

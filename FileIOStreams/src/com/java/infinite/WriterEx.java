package com.java.infinite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("d:\\File\\writer.txt");
			String s="welcome to ODC";
			w.write(s);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success...");
	}

}

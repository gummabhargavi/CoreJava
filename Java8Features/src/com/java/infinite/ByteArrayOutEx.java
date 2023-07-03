package com.java.infinite;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream fin=new FileOutputStream("d://File//ByteArrayOut.txt");
		FileOutputStream fin1=new FileOutputStream("d://File//BAO.txt");
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		
		bao.write(35);
		bao.writeTo(fin);
		bao.writeTo(fin1);
		
		bao.flush();
		bao.close();
		System.out.println("Success....");
	}

}

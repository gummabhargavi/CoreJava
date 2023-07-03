package com.java.infinite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReadEx {
	public static void main(String[] args) throws IOException{
		
		FileReader fr=new FileReader("d:\\File\\bufferwriter.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1){
			System.out.println((char)i);
			//br.close();
		}
	}

}

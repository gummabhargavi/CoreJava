package com.java.infinite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("d:\\File\\bufferwriter.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
		sb.append(" Infinite");
		sb.append(" Employers");
		System.out.println(sb.toString());
		
		bw.write("hi");
		bw.close();
		
	}

}

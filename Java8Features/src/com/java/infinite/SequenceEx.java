package com.java.infinite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceEx {

	public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("d://File//Text1.txt");
        FileInputStream fi1=new FileInputStream("d://File//writer.txt");
        SequenceInputStream si=new SequenceInputStream(fi,fi1);
        int j;
        while((j=si.read())!=-1){
        	System.out.println((char)j);
        }
        si.close();
        fi.close();
        fi1.close();
	}

}

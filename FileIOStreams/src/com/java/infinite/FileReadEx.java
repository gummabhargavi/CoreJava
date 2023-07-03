package com.java.infinite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("d:\\File\\filewriter.txt");
			int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
			fr.close(); /*in filewriter need to close the file then only we can
			             read the file (means then only it will shows the output on our console)*/ 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

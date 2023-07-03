package com.java.infinite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		//Employ e=new Employ();
		
			try {
				 //Creating stream to read the object  
				FileInputStream fout=new FileInputStream("d:\\File\\Char.text");
				ObjectInputStream in=new ObjectInputStream(fout);
				Employ e=(Employ)in.readObject();
				//printing the data of the serialized object  
				System.out.println("Employ name: "+e.name+"\n"+"Employ Adress: "+e.adress);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}

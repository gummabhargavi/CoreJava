package com.java.infinite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employ implements Serializable{
	
	public String name;
	public static String adress; // it will not be Serializable because static is a part of a class not object
}


public class Serilalization {
	public static void main(String[] args) {
		Employ e=new Employ();
		e.name="Bhargavi";
		e.adress="guntur";
		
		
			try {
				FileOutputStream fout=new FileOutputStream("d:\\File\\Char.text");
				ObjectOutputStream obout=new ObjectOutputStream(fout);
				obout.writeObject(e);
				obout.close();
				fout.close();
				System.out.println("Serializable data is saved in chart.text file"); //if we want to read this data we can use deserialization
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
//			try {
//				ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\File\\Char.text"));
//				Employ e1=(Employ)in.readObject();
//				System.out.println("Employ name: "+e1.name+"\n"+"Employ Adress: "+e1.adress);
//				in.close();
//			} catch (FileNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		
		
		
	}

}

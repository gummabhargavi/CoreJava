package com.java.infinite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	transient int age;  //transient means it hide the data it print the null value 
	public String qualification;
	
}
class Student1 extends Person{
	
	 public int id;
	 public String location;
}
public class InterfacePrg {
	
	public static void main(String[] args) {
		
		Student1 s=new Student1();
		s.age=22;
		s.qualification="B.tech";
		s.id=1;
		s.location="bnglr";
		
		try {
			FileOutputStream fout=new FileOutputStream("d:\\File\\student.text");
			ObjectOutputStream bout=new ObjectOutputStream(fout);
			bout.writeObject(s);
			bout.close();
			fout.close();
			System.out.println("Serializable data is saved in student.text file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\File\\student.text"));
			Student1 s1=(Student1)in.readObject();
			System.out.println("Person age: "+s1.age+"\n"+"Person Qualification: "+s1.qualification+"\n"
			+"Student id: "+s1.id+"\n"+"Student location: "+s1.location);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

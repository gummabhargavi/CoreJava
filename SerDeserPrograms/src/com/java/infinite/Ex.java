package com.java.infinite;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Externalizable{
	
	public int id;
	public String adress;
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
}

public class Ex {
	public static void main(String[] args) {
		
		Student s=new Student();
		s.id=1;
		s.adress="vijwada";
		
		try {
			FileOutputStream  fout=new FileOutputStream("d:\\File\\File1.text");
			ObjectOutputStream bout=new ObjectOutputStream(fout);
			bout.writeObject(s);
			fout.close();
			bout.close();
			System.out.println("Serializable data is saved in File1.text file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

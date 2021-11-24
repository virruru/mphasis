package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutEx {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/data.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(new String("Date is :   "));
			objout.writeObject(new Date());
			objout.close();
			fout.close();
			System.out.println("*** Object Created Successfully ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

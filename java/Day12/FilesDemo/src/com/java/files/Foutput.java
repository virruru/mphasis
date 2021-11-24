package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Foutput {
	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("D:/Mphasis_New/Java/Day6_1/StudentProject/src/com/java/infinite/student/Student.java");
			FileOutputStream fout = new FileOutputStream("c:/files/target.txt");
			int ch;
			while((ch=fin.read()) != -1) {
				fout.write((char)ch);
			}
			fin.close();
			fout.close();
			System.out.println("*** File Copied Sucessfully ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
	public static void main(String[] args) {
		try {
			FileInputStream fin = 
				new FileInputStream("D:/Mphasis_New/Java/Day6_1/StudentProject/src/com/java/infinite/student/Student.java");
			int ch;
			while((ch=fin.read()) != -1) {
				System.out.print((char)ch);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {

	public static void main(String[] args) {
		File f1 = new File("D:/Mphasis_New/Java/Day6_1/StudentProject/src/com/java/infinite/student/Student.java");
		try {
			FileReader fr = new FileReader(f1);
			int ch;
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

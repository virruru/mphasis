package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
	public static void main(String[] args) {
		File src = new File("D:/Mphasis_New/Java/Day6_1/StudentProject/src/com/java/infinite/student/Student.java");
		File target = new File("c:/files/student.txt");
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw=new FileWriter(target);
			int ch;
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.files;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("D:/Mphasis_New/Java/Day6_1/StudentProject/src/com/java/infinite/student/Student.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Parent Directory  " +f1.getParent());
		System.out.println("Path   " +f1.getPath());
	}
}

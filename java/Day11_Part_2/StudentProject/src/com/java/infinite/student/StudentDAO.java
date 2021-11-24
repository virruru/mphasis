package com.java.infinite.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	static List<Student> studentList;
	
	static {
		studentList = new ArrayList<Student>();
	}
	
	public Student searchStudentDao(int sno) {
		Student student = null;
		for (Student s : studentList) {
			if (s.getSno()==sno) {
				student = s;
			}
		}
		return student;
	}
	
	public String addStudentDao(Student student) {
		studentList.add(student);
		return "Student Record Inserted Successfully...";
	}
	
	public List<Student> showStudentDao() {
		return studentList;
	}
}

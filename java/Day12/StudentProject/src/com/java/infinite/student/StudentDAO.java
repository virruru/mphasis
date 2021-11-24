package com.java.infinite.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	static List<Student> studentList;
	
	static {
		studentList = new ArrayList<Student>();
	}
	
	public String updateStudentDao(Student studentNew) {
		Student old = searchStudentDao(studentNew.getSno());
		if (old!=null) {
			old.setSno(studentNew.getSno());
			old.setName(studentNew.getName());
			old.setCity(studentNew.getCity());
			old.setCgp(studentNew.getCgp());
			return "Student Record Updated...";
		}
		return "Student Record Not Found...";
	}
	public String deleteStudentDao(int sno ) {
		Student student = searchStudentDao(sno);
		if (student!=null) {
			studentList.remove(student);
			return "Student Record Deleted...";
		} else {
			return "Student Record Not Found...";
		}
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

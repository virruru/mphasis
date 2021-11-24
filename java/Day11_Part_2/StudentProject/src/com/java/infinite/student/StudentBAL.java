package com.java.infinite.student;

import java.util.List;

public class StudentBAL {

	static StringBuilder sb = new StringBuilder();
	
	public Student searchStudentBal(int sno) {
		return new StudentDAO().searchStudentDao(sno);
	}
	
	public String addStudentBal(Student student) throws StudentException {
		StudentDAO dao = new StudentDAO();
		if (validateStudent(student)==true) {
			return dao.addStudentDao(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
	
	public List<Student> showStudentBal() {
		return new StudentDAO().showStudentDao();
	}
	
	public boolean validateStudent(Student student) {
		boolean isAdded=true;
		if (student.getSno() <= 0) {
			isAdded=false;
			sb.append("Student No Cannot be Negative or Zero\n");
		}
		
		if (student.getName().length() <= 3) {
			isAdded=false;
			sb.append("Name cannot be less than 3 characters...\n");
		}
		
		if (student.getCity().length() <= 3) {
			isAdded=false;
			sb.append("City Cannot be Less than 3 characters...\n");
		}
		
		if (student.getCgp() <= 0) {
			isAdded=false;
			sb.append("Cgp Cannot be zero or Negative...\n");
		}
		return isAdded;
	}
}

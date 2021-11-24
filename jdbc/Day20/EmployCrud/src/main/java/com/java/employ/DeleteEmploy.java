package com.java.employ;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmploy {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAO();
		try {
			System.out.println(dao.deleteEmploy(empno));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.employ;

import java.sql.SQLException;

public class EmployShowAllMain {
	public static void main(String[] args) {
		EmployDAO dao = new EmployDAO();
		Employ[] arrEmploy;
		try {
			arrEmploy = dao.showEmploy();
			for (Employ employ : arrEmploy) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

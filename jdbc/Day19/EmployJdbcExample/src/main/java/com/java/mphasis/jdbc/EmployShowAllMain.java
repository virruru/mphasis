package com.java.mphasis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShowAllMain {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", 
					"prasanna", "prasanna");
			String cmd = "select * from Employ";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("Employ No    " +rs.getInt("empno"));
				System.out.println("Employ Name   " +rs.getString("name"));
				System.out.println("Gender  " +rs.getString("gender"));
				System.out.println("Department   " +rs.getString("dept"));
				System.out.println("Designation   " +rs.getString("desig"));
				System.out.println("Basic    " +rs.getInt("basic"));
				System.out.println("-------------------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

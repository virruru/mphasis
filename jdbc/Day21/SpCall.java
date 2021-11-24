package com.java.bank;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class SpCall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName  ");
		String fname = sc.next();
		System.out.println("Enter LastName  ");
		String lname = sc.next();
		System.out.println("Enter City  ");
		String city = sc.next();
		System.out.println("Enter State   ");
		String state = sc.next();
		System.out.println("Enter Amount   ");
		int amount = sc.nextInt();
		System.out.println("Enter CheqFacil   ");
		String cheqFacil = sc.next();
		System.out.println("Enter Account Type   ");
		String accType = sc.next();
		Connection con = ConnectionHelper.getConnection();
		String cmd = "{call prcAccountCreate(?,?,?,?,?,?,?)}";
		try {
			CallableStatement cst = con.prepareCall(cmd);
			cst.setString(1, fname);
			cst.setString(2, lname);
			cst.setString(3, city);
			cst.setString(4, state);
			cst.setInt(5, amount);
			cst.setString(6, cheqFacil);
			cst.setString(7, accType);
			cst.execute();
			System.out.println("*** Account Created ***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

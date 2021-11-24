package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class MiniStatementMain {

	public static void main(String[] args) {
		int accountNo;
		System.out.println("Enter AccountNo   ");
		Scanner sc = new Scanner(System.in);
		accountNo = sc.nextInt();
		AccountsDAO dao = new AccountsDAO();
		try {
			dao.miniStatement(accountNo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

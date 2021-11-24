package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNo;
		System.out.println("Enter AccountNo   ");
		Scanner sc = new Scanner(System.in);
		accountNo = sc.nextInt();
		AccountsDAO dao = new AccountsDAO();
		try {
			Accounts accounts = dao.searchAccount(accountNo);
			if (accounts!=null) {
				System.out.println(accounts);
			} else {
				System.out.println("*** AccountNo Not Found ***");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {

	public static void main(String[] args) {
		int accountNo;
		double depositAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo   ");
		accountNo = sc.nextInt();
		System.out.println("Enter Deposit Amount   ");
		depositAmount = sc.nextDouble();
		AccountsDAO dao = new AccountsDAO();
		try {
			System.out.println(dao.depositAccount(accountNo, depositAmount));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

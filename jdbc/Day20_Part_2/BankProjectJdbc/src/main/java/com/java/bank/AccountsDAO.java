package com.java.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountsDAO {

	Connection connection;
	PreparedStatement pst;
	
	public void miniStatement(int accountNo) throws SQLException {
		Accounts accounts = searchAccount(accountNo);
		if (accounts!=null) {
			String cmd = "select * from trans where accountNo=1 order by trandate desc";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			int count=0;
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				if (count < 10) {
				System.out.println("Account No  " +rs.getInt("accountNo") + "  "
				+ " TransAmount " +rs.getDouble("TranAmount") + " TranType "
						+ " " +rs.getString("TranType") + " Date  " +rs.getDate("TranDate"));
				}
				count++;
			}
		}
	}
	public String closeAccount(int accountNo) throws SQLException {
		Accounts accounts = searchAccount(accountNo);
		if (accounts!=null) {
			String cmd = "update accounts set status='inactive' "
					+ " where accountNo=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return "Account Closed...";
		}
		return "Account No. Not Found...";
	}
	
	public String withdrawAccount(int accountNo, double withdrawAmount) throws SQLException {
		Accounts accounts = searchAccount(accountNo);
		if (accounts != null) {
			double balance = accounts.getAmount();
			if (balance-withdrawAmount >= 1000) {
				connection = ConnectionHelper.getConnection();
				String cmd = "Update Accounts set Amount=Amount-? where AccountNo=?";
				pst = connection.prepareStatement(cmd);
				pst.setDouble(1, withdrawAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd = "Insert into Trans(AccountNo,TranAmount,TranType) values(?,?,?)";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				return "Amount Debited...";
			} else {
				return "Insufficient Funds...";
			}
		}
		return "AccountNo Not Found...";
	}
	public String depositAccount(int accountNo, double depositAmount) throws SQLException {
		Accounts accounts = searchAccount(accountNo);
		if (accounts != null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Update Accounts set Amount=Amount+? where AccountNo=?";
			pst = connection.prepareStatement(cmd);
			pst.setDouble(1, depositAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd = "Insert into Trans(AccountNo,TranAmount,TranType) values(?,?,?)";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setDouble(2, depositAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			return "Amount Credited...";
		}
		return "AccountNo Not Found...";
		
	}
	public Accounts searchAccount(int accountNo) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Accounts where AccountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Accounts accounts = null;
		if (rs.next()) {
			accounts = new Accounts();
			accounts.setAccountNo(rs.getInt("accountNo"));
			accounts.setFirstName(rs.getString("firstName"));
			accounts.setLastName(rs.getString("lastName"));
			accounts.setCity(rs.getString("city"));
			accounts.setState(rs.getString("state"));
			accounts.setAmount(rs.getDouble("amount"));
			accounts.setCheqFacil(rs.getString("cheqFacil"));
			accounts.setAccountType(rs.getString("accountType"));
		}
		return accounts;
	}
	public int generateAccountNo() throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = " select case when max(accountNo) is NULL"
				+ " then 1 else max(accountNo)+1 end accno from Accounts ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accountNo = rs.getInt("accno");
		return accountNo;
	}
	
	public String createAccount(Accounts accounts) throws SQLException {
		int accno = generateAccountNo();
		accounts.setAccountNo(accno);
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Accounts(Accountno,FirstName,LastName,City,State,Amount,CheqFacil,"
				+ "AccountType) values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accno);
		pst.setString(2, accounts.getFirstName());
		pst.setString(3, accounts.getLastName());
		pst.setString(4, accounts.getCity());
		pst.setString(5, accounts.getState());
		pst.setDouble(6, accounts.getAmount());
		pst.setString(7, accounts.getCheqFacil());
		pst.setString(8, accounts.getAccountType());
		pst.executeUpdate();
		return "Account Created Successfully...";
	}
}

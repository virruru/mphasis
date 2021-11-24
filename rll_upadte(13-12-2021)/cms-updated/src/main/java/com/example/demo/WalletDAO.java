package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WalletDAO {
	
	@Autowired  
    JdbcTemplate jdbc;  
	
	public Wallet showCustomerWallet(int custId,String walType) {
		String cmd = "select * from Wallet where cus_id=? AND WAL_SOURCE=?";

		List<Wallet> str=jdbc.query(cmd,new Object[] {custId,walType}, new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setWal_id(rs.getInt("wal_id"));
				wallet.setCus_id(rs.getInt("cus_id"));
				wallet.setWal_amount(rs.getDouble("wal_amount"));
				wallet.setWal_source(rs.getString("wal_source"));
				return wallet;
			}
			
		});
		return str.get(0);
	}
	public List<Wallet> showCustomerWallets(int custId) {
		String cmd = "select * from Wallet where cus_id=?";
		List<Wallet> wallets=null;
		wallets=jdbc.query(cmd,new Object[] {custId}, new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setWal_id(rs.getInt("wal_id"));
				wallet.setCus_id(rs.getInt("cus_id"));
				wallet.setWal_amount(rs.getDouble("wal_amount"));
				wallet.setWal_source(rs.getString("wal_source"));
				return wallet;
			}
			
		});
		return wallets;
	}
	public String updateWallet(int custId, String walType, double walAmount) {
        String cmd = "Update Wallet set WAL_AMOUNT=WAL_AMOUNT-? "
                + " WHERE CUS_ID=? AND WAL_SOURCE=?";
        jdbc.update(cmd, new Object[] {walAmount,custId,walType});
        return "Amount Debited from Wallet...";
    }
}

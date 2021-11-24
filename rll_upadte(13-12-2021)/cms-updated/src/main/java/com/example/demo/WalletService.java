package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WalletService {

	@Autowired
    private WalletRepository repo;
	
	@Autowired
	private WalletDAO dao;
	
	public Wallet showCustomerWallet(int custId,String walType) {
		return dao.showCustomerWallet(custId,walType);
	}
	public List<Wallet> showCustomerWallets(int custId) {
		return dao.showCustomerWallets(custId);
	}
}

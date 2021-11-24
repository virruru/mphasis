package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

	@Autowired
	private WalletService walletService;
	 @CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/showCustomerWallets/{id}")
	public List<Wallet> getCustomerWallets(@PathVariable int id) {
		return walletService.showCustomerWallets(id);
	}
	 @CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/showCustomerWallet/{id}/{walType}")
	public Wallet getCustomerWallet(@PathVariable int id, @PathVariable String walType) {
		return walletService.showCustomerWallet(id,walType);
	}
}

package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	@Transactional
		public class OrdersService {
		    @Autowired
		    private OrdersRepository repo;
		    
		   
		    @Autowired
		    private OrderDAO dao;
		   		    
		    public List<Orders> showVendorPendingOrders(int venId) {
				return dao.showVendorPendingOrders(venId);
			}
			public List<Orders> showVendorOrders(int venId) {
				return dao.showVendorOrders(venId);
			}
			public List<Orders> showCustomerOrders(int custId) {
				return dao.showCustomerOrders(custId);
			}
			public List<Orders> showCustomerPendingOrders(int custId) {
				return dao.showCustomerPendingOrders(custId);
			}
		    
		
}

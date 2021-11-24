package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersService {
	
	
    @Autowired 
    private MenuDAO mdao;
	    @Autowired
	    private OrdersRepository repo;
	    

	    @Autowired 
	    private WalletDAO wdao;
	    @Autowired
	    private OrdersDAO dao;
	    @Autowired
	    private JavaMailSender javaMailSender;
	   		    
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
		public List<Orders> showOrders() {
	        return repo.findAll();
	    }
		public String placeOrder(Orders order) {
	    	order.setOrd_id(dao.generateordid());
	        Menu menu = mdao.searchMenu(order.getMen_id());
	        Wallet wallet = wdao.showCustomerWallet(order.getCus_id(), order.getWal_source());
	        double balance = wallet.getWal_amount();
	        double billAmount = order.getOrd_quantity()*menu.getMen_price();
	        System.out.println(balance);
	        System.out.println(billAmount);
	        if (balance-billAmount > 0) {
	            order.setOrd_status("PENDING");
	            order.setOrd_billamount(order.getOrd_quantity()*menu.getMen_price());
	            repo.save(order);
	            wdao.updateWallet(order.getCus_id(), order.getWal_source(), billAmount);
//	            final String username = "rllprojectkrithiks@gmail.com";
//	            final String password = "Rllproject@123";
//	                 
//
//	            Properties prop = new Properties();
//	            prop.put("mail.smtp.host", "smtp.gmail.com");
//	            prop.put("mail.smtp.port", "587");
//	            prop.put("mail.smtp.auth", "true");
//	            prop.put("mail.smtp.starttls.enable", "true"); //TLS
//	            
//	            Session session = Session.getInstance(prop,
//	                    new javax.mail.Authenticator() {
//	                        protected PasswordAuthentication getPasswordAuthentication() {
//	                            return new PasswordAuthentication(username, password);
//	                        }
//	                    });
//
//	            try {
//
//	                Message message = new MimeMessage(session);
//	                message.setFrom(new InternetAddress("rllprojectkrithiks@gmail.com"));
//	                message.setRecipients(
//	                        Message.RecipientType.TO,
//	                        InternetAddress.parse("vgrabi004@gmail.com,sshanmu7@gmail.com,puiangtraining@gmail.com")
//	                );
//	                message.setSubject("Hi Prasanna Sir! - Your Order will be delivered within 10 mins");
//	                //message.setText(order.getOrd_status());
//	                message.setText("Hello there! \n Customer ID : " + Integer.toString(order.getCus_id()) + "\nStatus:" + order.getOrd_status() + 
//	                		"\n Bill Amount : " + Double.toString(order.getOrd_billamount()) + 
//	                		"\n Order Quantity : " +Integer.toString(order.getOrd_quantity()));
//
//	                Transport.send(message);
//
//	                System.out.println("Done");
//
//	            } catch (MessagingException e) {
//	                e.printStackTrace();
//	            }
	            SimpleMailMessage msg = new SimpleMailMessage();
		        msg.setTo("udayp43343@gmail.com");

		        msg.setSubject("Hi Prasanna Sir! - Your Order will be delivered within 10 mins");
               //message.setText(order.getOrd_status());
                msg.setText("Hello there! \n Customer ID : " + Integer.toString(order.getCus_id()) + "\nStatus:" + order.getOrd_status() + 
                		"\n Bill Amount : " + Double.toString(order.getOrd_billamount()) + 
                		"\n Order Quantity : " +Integer.toString(order.getOrd_quantity()));
		        
                javaMailSender.send(msg);
	        
	            return "Order Placed Successfully...and Amount Debited";
	        }
	        return "Insufficient Funds...";
	    }
}



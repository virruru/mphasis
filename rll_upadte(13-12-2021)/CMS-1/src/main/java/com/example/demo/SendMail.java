//package com.example.demo;
//
//import java.util.Properties;
//
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
//public class SendMail {
//	public static void main(String[] args) {
////		
////		final String username = "rllprojectkrithiks@gmail.com";
////        final String password = "Rllproject@123";
////             
////
////        Properties prop = new Properties();
////        prop.put("mail.smtp.host", "smtp.gmail.com");
////        prop.put("mail.smtp.port", "587");
////        prop.put("mail.smtp.auth", "true");
////        prop.put("mail.smtp.starttls.enable", "true"); //TLS
////        
////        Session session = Session.getInstance(prop,
////                new javax.mail.Authenticator() {
////                    protected PasswordAuthentication getPasswordAuthentication() {
////                        return new PasswordAuthentication(username, password);
////                    }
////                });
////
////        try {
////
////            Message message = new MimeMessage(session);
////            message.setFrom(new InternetAddress("rllprojectkrithiks@gmail.com"));
////            message.setRecipients(
////                    Message.RecipientType.TO,
////                    InternetAddress.parse("vgrabi004@gmail.com,sshanmu7@gmail.com")
////            );
////            message.setSubject("Testing RLL");
////            message.setText("Dear Team this is java program,"
////                    + "\n\n Successfully running by Prasanna...!");
////
////            Transport.send(message);
////
////            System.out.println("Done");
////
////        } catch (MessagingException e) {
////            e.printStackTrace();
////        }
////    }
//	
//	final String sendemail() {
//		
//
//		final String username = "rllprojectkrithiks@gmail.com";
//        final String password = "Rllproject@123";
//             
//
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//        
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("rllprojectkrithiks@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse("vgrabi004@gmail.com,sshanmu7@gmail.com")
//            );
//            message.setSubject("Testing RLL");
//            message.setText("Dear Team this is java program,"
//                    + "\n\n Successfully running by Prasanna...!");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    
//		
//		return "Done";
//		
//	}
//}

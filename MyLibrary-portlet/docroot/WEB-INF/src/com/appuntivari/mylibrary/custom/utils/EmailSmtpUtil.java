package com.appuntivari.mylibrary.custom.utils;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;


public class EmailSmtpUtil{
	
	private final static Logger logger = Logger.getLogger(EmailSmtpUtil.class.getName());
	
	private final static String MAIL_PORT = "";
	private final static String MAIL_SERVER = "";
	private final static String MAIL_FROM = "";
	private final static String MAIL_STARTTLS = "";
	private final static String MAIL_AUTH = "";
	private final static String MAIL_USER = "";
	private final static String MAIL_PWD = "";
	
	public EmailSmtpUtil(){}
	
	
	public static void sendEmailFormatHtml(String to, String bodyHtml, String subject){
		
		logger.info("sendEmailFormatHtml");
		logger.info("Message send in progress...");
		
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", MAIL_SERVER);
		properties.setProperty("mail.smtp.port", MAIL_PORT);
		Session session = Session.getDefaultInstance(properties);
		if(MAIL_AUTH.equals("true")){
			properties.setProperty("mail.smtp.auth", MAIL_AUTH);
			properties.setProperty("mail.smtp.starttls.enable", MAIL_STARTTLS);
			session = Session.getInstance(properties,
		    		  new javax.mail.Authenticator() {
    			protected PasswordAuthentication getPasswordAuthentication() {
    				return new PasswordAuthentication(MAIL_USER,MAIL_PWD);
    			}
    		  });
		}
		
		 try{
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(MAIL_FROM));
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	         message.setSubject(subject);	         
	         message.setContent(bodyHtml,
	                            "text/html" );
	        
	         Transport.send(message);
	         logger.info("... MESSAGE SENDED with SUCCESS.");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	         logger.info("... MESSAGE SENDED with FAIL!!!!!!!!!");
	      }		
		
	}
	public static void sendEmailFormatPlain(String to, String bodyPlain, String subject){
		
		logger.info("sendEmailFormatPlain");
		logger.info("Message send in progress...");
		
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", MAIL_SERVER);
		properties.setProperty("mail.smtp.port", MAIL_PORT);
		Session session = Session.getDefaultInstance(properties);
		if(MAIL_AUTH.equals("true")){
			properties.setProperty("mail.smtp.auth", MAIL_AUTH);
			properties.setProperty("mail.smtp.starttls.enable", MAIL_STARTTLS);
			session = Session.getInstance(properties,
		    		  new javax.mail.Authenticator() {
    			protected PasswordAuthentication getPasswordAuthentication() {
    				return new PasswordAuthentication(MAIL_USER,MAIL_PWD);
    			}
    		  });
		}
		
		 try{
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(MAIL_FROM));
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	         message.setSubject(subject);	         
	         message.setContent(bodyPlain,
	                            "text/plain" );
	        
	         Transport.send(message);
	         logger.info("... MESSAGE SENDED with SUCCESS.");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	         logger.info("... MESSAGE SENDED with FAIL!!!!!!!!!");
	      }		
		 
	}
	public static void sendEmailFilePath(String to, String bodyPlain, String filePath, String subject){
		
		logger.info("sendEmailFilePath");
		logger.info("Message send in progress...");
		
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", MAIL_SERVER);
		properties.setProperty("mail.smtp.port", MAIL_PORT);
		Session session = Session.getDefaultInstance(properties);
		if(MAIL_AUTH.equals("true")){
			properties.setProperty("mail.smtp.auth", MAIL_AUTH);
			properties.setProperty("mail.smtp.starttls.enable", MAIL_STARTTLS);
			session = Session.getInstance(properties,
		    		  new javax.mail.Authenticator() {
    			protected PasswordAuthentication getPasswordAuthentication() {
    				return new PasswordAuthentication(MAIL_USER,MAIL_PWD);
    			}
    		  });
		}
		
		 try{
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(MAIL_FROM));
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	         message.setSubject(subject);
	                  
	         BodyPart messageBodyPart = new MimeBodyPart();
	         messageBodyPart.setText(bodyPlain);	         
	         Multipart multipart = new MimeMultipart();
	         multipart.addBodyPart(messageBodyPart);

	         messageBodyPart = new MimeBodyPart();
	         String filename = ""+filePath+".pdf";
	         DataSource source = new FileDataSource(filePath);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);

	         message.setContent(multipart);
	        
	         Transport.send(message);
	         logger.info("... MESSAGE SENDED with SUCCESS.");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	         logger.info("... MESSAGE SENDED with FAIL!!!!!!!!!");
	      }		
		 
	}
	public static void sendEmailFileByte(String to, String message, byte[] file, String subject){
		
		logger.info("sendEmailFileByte");
		logger.info("NOT IMPLEMENTED");
		
	}
	
}


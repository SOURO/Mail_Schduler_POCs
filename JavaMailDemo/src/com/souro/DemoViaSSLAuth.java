/**
 * 
 */
package com.souro;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author sourabrata
 *
 */
public class DemoViaSSLAuth {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("soura1990", "hopeforbest");
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("souro.nitd@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("soura1990@gmail.com"));
			message.setSubject("Souro Subject3");
			message.setText("Dear XXX3," + "\n\n, You are lucky, you are getting text from me !");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}

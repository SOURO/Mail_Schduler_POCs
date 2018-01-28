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
public class DemoViaTLSAuth {
	public static void main(String[] args) {

		final String username = "soura1990@gmail.com";
		final String password = "hopeforbest";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("souro.nitd@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("soura1990@gmail.com"));
			message.setSubject("Souro Subject2");
			message.setText("Dear XXX2," + "\n\n, You are lucky, you are getting text from me !");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}

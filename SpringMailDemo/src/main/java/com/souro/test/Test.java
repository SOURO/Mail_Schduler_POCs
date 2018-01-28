/**
 * 
 */
package com.souro.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.souro.service.MailServiceDemo;

/**
 * @author sourabrata
 *
 */
public class Test {

    public static void main(String[] args)
    {
        //Create the application context
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
         
        //Get the mailer instance
        MailServiceDemo  mailer = (MailServiceDemo) context.getBean("mailServiceDemo");
 
        //Send a composed mail
        mailer.sendMail("soura1990@gmail.com", "Demo Subject1", "Demo Body1");
 
        //Send a pre-configured mail
        mailer.sendPreConfiguredMail("Have you enjoyed yet, no ?? .. Start Enjoying ????");
    }
}

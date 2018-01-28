/**
 * 
 */
package com.souro.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.souro.config.AppConfig;

/**
 * @author sourabrata
 *
 */
public class Test {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}

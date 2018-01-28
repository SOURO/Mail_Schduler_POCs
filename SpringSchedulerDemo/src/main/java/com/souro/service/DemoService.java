/**
 * 
 */
package com.souro.service;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author sourabrata
 *
 */
public class DemoService {
	@Scheduled(fixedRate = 5000)
	public void printMessage() {
		System.out.println("Spring scheduler Demo");
	}
}

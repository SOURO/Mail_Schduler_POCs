/**
 * 
 */
package com.souro;

import java.util.Timer;

/**
 * @author sourabrata
 *
 */
public class Test {
	
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer();
		SchedulerTask st = new SchedulerTask();
		time.schedule(st, 0, 1000);

		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}
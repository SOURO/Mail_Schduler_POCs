/**
 * 
 */
package com.souro;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author sourabrata
 *
 */
public class SchedulerTask extends TimerTask {
	Date now;

	public void run() {
		now = new Date();
		System.out.println("Time is :" + now);
	}
}

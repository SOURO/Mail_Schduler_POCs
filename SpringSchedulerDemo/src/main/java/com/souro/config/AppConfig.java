/**
 * 
 */
package com.souro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.souro.service.DemoService;

/**
 * @author sourabrata
 *
 */


@Configuration
@EnableScheduling
public class AppConfig {
	@Bean
	public DemoService demoService() {
		return new DemoService();
	}
}

package org.springframework.boot.wl.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.springframework.boot.wl.service")
public class ScanConfig {

	@Bean
	@Scope(value = "prototype")
	public Person getPerson(){
		return new Person(1,"王郎");
	}
}

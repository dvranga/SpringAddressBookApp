package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressbookappApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AddressbookappApplication.class, args);
		log.info("Address Book Application started ");
		log.info(applicationContext.getEnvironment().getProperty("environment"));
	}

}

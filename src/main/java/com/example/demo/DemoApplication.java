package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
	public static Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application Started -------->");
	}
	public static void main(String[] args) {
		log.info("Application Executed -------->");
		SpringApplication.run(DemoApplication.class, args);
	}

}

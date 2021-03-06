package com.app.microapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class MicroApplication implements ApplicationRunner {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MicroApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MicroApplication.class, args);		
	}
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		LOGGER.info("sample springboot application");
	}
			
	
}

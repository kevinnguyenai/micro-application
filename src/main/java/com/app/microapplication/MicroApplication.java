package com.app.microapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class MicroApplication implements ApplicationRunner {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MicroApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MicroApplication.class, args);		
	}
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Hello ApplicationRunner");
	}
	
	@RequestMapping(value="/name", method=RequestMethod.GET)
	public String name() throws Exception {
		LOGGER.info("This is information");
		LOGGER.debug("This is debug");
		LOGGER.error("This is error");		
		return("simple GET METHOD ");
	}
	

	
}

package com.app.microapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;


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

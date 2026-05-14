package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.app.entity") 
public class SbcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcrudApplication.class, args);
	}

}

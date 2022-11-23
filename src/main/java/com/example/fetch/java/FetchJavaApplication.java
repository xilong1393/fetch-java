package com.example.fetch.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.controller")
public class FetchJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FetchJavaApplication.class, args);
	}

}

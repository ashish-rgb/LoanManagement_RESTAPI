package com.nissan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanManagementSystemRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagementSystemRestapiApplication.class, args);
		System.out.println("Loan Management REST API Works");
	}

}

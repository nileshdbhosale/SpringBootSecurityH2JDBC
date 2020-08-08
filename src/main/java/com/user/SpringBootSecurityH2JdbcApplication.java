package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityH2JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityH2JdbcApplication.class, args);
		System.out.print("Welcome to Springboot Security with JDBC !");
	}

}

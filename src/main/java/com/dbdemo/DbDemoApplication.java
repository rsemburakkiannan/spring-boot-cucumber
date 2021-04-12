package com.dbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class DbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}

}

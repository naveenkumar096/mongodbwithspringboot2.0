package com.example.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@EnableMongoAuditing
@EnableReactiveMongoRepositories
@SpringBootApplication
public class SprignBootLearingApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SprignBootLearingApplication.class, args);
	}
}

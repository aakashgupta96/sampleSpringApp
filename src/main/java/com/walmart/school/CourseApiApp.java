package com.walmart.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CourseApiApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);

	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
       return builder.sources(CourseApiApp.class);
	}

}

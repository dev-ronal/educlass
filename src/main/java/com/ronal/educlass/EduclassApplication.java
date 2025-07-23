package com.ronal.educlass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ronal.educlass", "org.ronal.exceptionr"})
public class EduclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduclassApplication.class, args);
	}

}

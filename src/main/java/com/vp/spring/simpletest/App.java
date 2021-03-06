package com.vp.spring.simpletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
package com.nibm.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.nibm.model")
@ComponentScan("com.nibm")
@EntityScan("com.nibm.model")
public class BootApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SpringApplication.run(BootApp.class, args);
	}

}

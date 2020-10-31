package com.nibm.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nibm")
public class BootApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SpringApplication.run(BootApp.class, args);
	}

}

package com.vinodyara.fullStackWebApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.devopsBuddy.web.controllers.advices"))
public class DevopsBuddyApplication {
		
	public static void main(String[] args) {

	System.out.println("Hi");
	SpringApplication.run(DevopsBuddyApplication.class,args);
	
	}
	
}

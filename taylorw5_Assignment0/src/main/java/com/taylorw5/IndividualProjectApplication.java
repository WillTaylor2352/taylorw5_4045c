package com.taylorw5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IndividualProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndividualProjectApplication.class, args);
	}

}
// VERY IMPORTANT: for some reason, eclipse does not like thymeleaf and continuously overwrites its auto-find-templates feature
//		for the code to function properly, templates must be placed directly in the classpath. 
// This is contradictory to the videos in class, and to testing on my local system. But I've tested dozens of other solutions
// ad nauseum. This is the only way I've managed to get things working
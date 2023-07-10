package com.bessem.demospringapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Permet d'identifier cette class comme une app spring boot
public class DemoSpringApiApplication {

	// Point d'entrée de l'application
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApiApplication.class, args);
	}

}

package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.eventoapp.controllers.EventoController;

@SpringBootApplication
@ComponentScan(basePackageClasses = {EventoController.class})
public class EventoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoappApplication.class, args);
	
	}
}

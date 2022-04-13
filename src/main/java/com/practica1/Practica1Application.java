package com.practica1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.practica1.componetes.ComponenteDependencia;

@SpringBootApplication
public class Practica1Application implements CommandLineRunner {
	
	ComponenteDependencia componenteDependencia;
	
	public Practica1Application(ComponenteDependencia componenteDependencia) {
		this.componenteDependencia=componenteDependencia;
		
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String nombre = this.componenteDependencia.leerTeclado();
		this.componenteDependencia.salidaMensaje(nombre);

		
	}

}

package com.practica1.componetes;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ComponenteImplementa implements ComponenteDependencia {

	@Override
	public void salidaMensaje(String mensaje) {
		System.out.print(mensaje);
		
	}

	@Override
	public String leerTeclado() {
		System.out.println("por favor ingresa un nombre:");
		Scanner leer = new Scanner(System.in);
		return leer.nextLine();
	}	
}

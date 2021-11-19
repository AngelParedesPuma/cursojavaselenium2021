package com.java.basic;
 
public class ConditionalStatement {
 
	public static void main(String[] args) {
		// Ejercicio en clase - Automovil
 
		int velocidad = 50; // KM/H
		int limiteVelocidad = 60;	
		boolean carretera = false;
		boolean escolar = false;
		
		// IF
		// IF ELSE
		// IF anidado
		// IF ELSE IF
		
		//
				
		if(carretera && escolar ) {
 
			limiteVelocidad = 110;
 
			if(velocidad>limiteVelocidad) {
				System.out.println("El coche va a exceso de velocidad - Multa1");
			}else {
				System.out.println("El coche va a una velocidad adecuada - Premio1");
			}
		} else if(escolar  && velocidad>limiteVelocidad) {
			System.out.println("CALLE");
			System.out.println("El coche va a exceso de velocidad - Multa2");
		}else {
			System.out.println("El coche va a una velocidad adecuada - escolar");
		}
 
		// TAREA : Agregar a este ejercicio la condicion o la variable de zona escolar
 
		// SWITCH
 
		int temperatura = 6; //Grados C
 
		switch(temperatura) {
 
		case 5:
		case 6:
		case 7:
			System.out.println("Clima Frio");
			break;
 
		case 20:
			System.out.println("Clima templado");
			break;
 
		case 35:
			System.out.println("Clima caluroso");
			break;
 
		default:
			System.out.println("Otro clima");
			break;
		}		
 
	}
 
}
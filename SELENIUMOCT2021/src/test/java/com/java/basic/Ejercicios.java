package com.java.basic;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 {
			 //Crear un programa que valide el limite de velocidad de un coche cuando vaya en una carretera, zona escolar o calle normal
             //utilizando estructuras condicionales con IF

				int velocidad = 20; // KM/H
				int limiteVelocidad ;	
		        boolean viacarretera =false ;
		        boolean viaescolar =true ;
		        boolean viacalle =false ;
		        if (viacarretera ) {
		        	limiteVelocidad = 100;
		        	if( velocidad>limiteVelocidad) {
		        		System.out.println("El coche va a exceso de velocidad - Multa1");
		        	}else {
		        	System.out.println("El coche va a una velocidad adecuada - Premio1");
		        	}
		            System.out.println("viacarretera");
		        }else if ( viaescolar ) {
						limiteVelocidad = 20;
		        	if(velocidad>limiteVelocidad) {
		        		System.out.println("El coche va a exceso de velocidad - Multa2");
		        	}else {
		        	System.out.println("El coche va a una velocidad adecuada - Premio2");
		        	}			
		            System.out.println("viaescolar");
				}else if (viacalle) { 
					limiteVelocidad = 40;
					if(velocidad>limiteVelocidad) {
		        		System.out.println("El coche va a exceso de velocidad - Multa3");
		        	}else {
		        	System.out.println("El coche va a una velocidad adecuada - Premio3");
		        	}
					System.out.println("viacalle");
				}else {
					System.out.println("El coche va por otra via");
				}
		    }
			//**************************************
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
	
	


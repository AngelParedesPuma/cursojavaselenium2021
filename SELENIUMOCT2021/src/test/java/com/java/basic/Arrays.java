package com.java.basic;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arreglo unidimensional 
		String[] dias= {"lunes","martes","miercoles", "jueves","viernes","sabado","domingo"};
				for (int i=0 ; i<dias.length;i++) {
					System.out.println("el día de la semana es "+dias[i]);
				}
		//arreglo bidimensionales 
		
		String [][]	nombreCompleto =new String[4][2];
		nombreCompleto[0][0] ="Ricardo";
		nombreCompleto[0][1] ="Avalos";
		nombreCompleto[1][0] ="Angel";
		nombreCompleto[1][1] ="Paredes";
		nombreCompleto[2][0] ="Sandra";
		nombreCompleto[2][1] ="Villanueva";
		nombreCompleto[3][0] ="Petter";
		nombreCompleto[3][1] ="Alva";	
		
		System.out.println("el nombre es "+ nombreCompleto[0][0] + " "+ nombreCompleto[0][1] );
		System.out.println("el nombre es "+ nombreCompleto[1][0] + " "+ nombreCompleto[1][1] );
		System.out.println("el nombre es "+ nombreCompleto[2][0] + " "+ nombreCompleto[2][1] );
		System.out.println("el nombre es "+ nombreCompleto[3][0] + " "+ nombreCompleto[3][1] );
	}

	
	
}

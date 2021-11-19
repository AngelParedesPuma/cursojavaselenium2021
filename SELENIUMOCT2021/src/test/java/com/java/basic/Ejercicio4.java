package com.java.basic;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 
Crear un método que se llame “imprimirVerificadorNumeros” con 3 parámetros de tipo int. 
El método no debe devolver nada (void).
Si uno de los parámetros es menor que 0, imprima el texto "Valor no válido".
Si todos los números son iguales, imprima el texto "Todos los números son iguales"
Si todos los números son diferentes, imprima el texto "Todos los números son diferentes".
De lo contrario, imprima "Ni todos son iguales ni diferentes".

EJEMPLOS DE ENTRADA / SALIDA:

printEqual (1, 1, 1); debe imprimir texto Todos los números son iguales.
printEqual (1, 1, 2); deben imprimir texto Ni todos son iguales o diferentes.
printEqual (-1, -1, -1); debe imprimir el texto Valor no válido.
printEqual (1, 2, 3); debe imprimir texto Todos los números son diferentes. 
*/
		imprimirVerificadorNumeros(1, 2, 3);

	}

		public static void imprimirVerificadorNumeros(int x, int y, int z) {
		 if (0>x || 0> y|| 0> z) {
			 System.out.println("Valor no válido");
		 }else if (x == y && y== z) {
			 System.out.println("Todos los números son iguales");
		 }else if (x != y && y != z && x !=z) {
			 System.out.println("Todos los números son diferentes");
		 }else {
			 System.out.println("Ni todos son iguales o diferentes");
		 }
		 		 
		 
		}
}

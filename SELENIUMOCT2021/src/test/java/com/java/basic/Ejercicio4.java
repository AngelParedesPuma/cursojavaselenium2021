package com.java.basic;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 
Crear un m�todo que se llame �imprimirVerificadorNumeros� con 3 par�metros de tipo int. 
El m�todo no debe devolver nada (void).
Si uno de los par�metros es menor que 0, imprima el texto "Valor no v�lido".
Si todos los n�meros son iguales, imprima el texto "Todos los n�meros son iguales"
Si todos los n�meros son diferentes, imprima el texto "Todos los n�meros son diferentes".
De lo contrario, imprima "Ni todos son iguales ni diferentes".

EJEMPLOS DE ENTRADA / SALIDA:

printEqual (1, 1, 1); debe imprimir texto Todos los n�meros son iguales.
printEqual (1, 1, 2); deben imprimir texto Ni todos son iguales o diferentes.
printEqual (-1, -1, -1); debe imprimir el texto Valor no v�lido.
printEqual (1, 2, 3); debe imprimir texto Todos los n�meros son diferentes. 
*/
		imprimirVerificadorNumeros(1, 2, 3);

	}

		public static void imprimirVerificadorNumeros(int x, int y, int z) {
		 if (0>x || 0> y|| 0> z) {
			 System.out.println("Valor no v�lido");
		 }else if (x == y && y== z) {
			 System.out.println("Todos los n�meros son iguales");
		 }else if (x != y && y != z && x !=z) {
			 System.out.println("Todos los n�meros son diferentes");
		 }else {
			 System.out.println("Ni todos son iguales o diferentes");
		 }
		 		 
		 
		}
}

package com.java.basic;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Crea un m�todo que tenga como nombre �hasEqualSum� con 3 par�metros de tipo int.
El m�todo debe regresar un valor boolean �True� si la suma de los dos primeros par�metros es igual a la suma del tercer par�metro, en otro caso devolver �False�.
EJEMPLOS DE ENTRADA / SALIDA:
hasEqualSum(1, 1, 1);  deber�a regresar FALSE porque la suma de 1+1 no es 1. 
hasEqualSum(1, 1, 2);  deber�a regresar TRUE porque la suma de 1+1 s� es 2.
 */
		//hasEqualSum(1, 3, 2);
		hasEqualSum2(1, 1, 1);
		}
	/*	public static int suma(int x, int y) {
			int suma = x+y;
		return suma;
	}
		public static void hasEqualSum(int x, int y, int z) {
		if(z==suma(x,y)) {
			System.out.println("La suma de "+ x + " + " + y +" es igual a "+  z);
		}else {
			System.out.println("La suma de "+ x + " + " + y +" NO es igual a "+  z);
		}		
	}
		*/
		public static boolean hasEqualSum2(int x, int y, int z) {
		boolean r; 
			if(z==x+y)
		{ r =true;
					System.out.println("La suma2 de "+ x + " + " + y +" es igual a "+  z);
		}else { r =false;
			System.out.println("La suma2 de "+ x + " + " + y +" NO es igual a "+  z);
		      }
			return r;
		}	
		
///public static boolean hasEqualSum(int num1, int num2, int num3) {
//			return (num1 + num2 == num3) ? true : false;
//		}
}

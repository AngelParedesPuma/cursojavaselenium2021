package com.java.basic;

public class Ejercicio6 {

	/*
	 * Crea un metodo que se llame “areEqualBythreeDecimalPlaces” con dos parámetros de tipo “double”.
El metodo debe regresar boolean y regresar “True” si los dos numeres tienen los mismos números en los 3 decimales principales, por otro lado regresara “False”.

EJEMPLOS ENTRADA/SALIDA:
areEqualByThreeDecimalPlaces(-3.1756, -3.175); regresara “True” ya que los 3 decimales son iguales.
areEqualByThreeDecimalPlaces(3.175, 3.176); regresara “False” ya que los 3 decimales son diferentes.
areEqualByThreeDecimalPlaces(3.0, 3.0); regresara “True” ya que los decimales son iguales.
areEqualByThreeDecimalPlaces(-3.123, 3.123); regresara “False” ya que los números son diferentes.

Tip: Investigar casting de java.

	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	areEqualBythreeDecimalPlaces(23.123 	, 434.123);
}


	
	
	public static boolean areEqualBythreeDecimalPlaces(double  x ,double y) {
		 
		
		double parteDecimalx = x % 1;
	
		double parteDecimaly = y % 1;
	
		
	    if (parteDecimalx ==parteDecimaly ) {
	    	
	    	System.out.println("Los # son TRUE "+ " x " + parteDecimalx + " y " + parteDecimaly );
	    	return true ;
	    }else {
	    		
	    		System.out.println("Los # son FALSE " + " x " + parteDecimalx + " y " + parteDecimaly);
	    		return false;
	    	}
	    }
	    
	/*
	 * public static boolean areEqualsblablabla(double x, double y) {
		
		// 4.00915717717167		
		// 4.01028772972
		
		x = x *1000;
		y = y *1000;
		
		int convertX = (int) x;
		int convertY = (int) y;
		
		if(convertX==convertY) {
			return true;
		}else {
			return false;
		}
	}
	 *     
	 *     
	 *     
	 */
	
	
	
	
	} 	

	


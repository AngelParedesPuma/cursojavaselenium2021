// perro ladra
/*
 * Tenemos un perro al que le gusta ladrar. �Necesitamos despertarnos si el perro ladra por la noche!
Escriba un m�todo shouldWakeUp que tenga 2 par�metros.
El primer par�metro debe ser de tipo booleano y debe llamarse ladrido, representa si nuestro perro est� ladrando actualmente.
El segundo par�metro representa la hora del d�a y es de tipo int con el nombre hourOfDay y tiene un rango v�lido de 0-23.
Tenemos que despertarnos si el perro est� ladrando antes de las 8 o despu�s de las 22 horas para que en ese caso vuelva verdadero.
En todos los dem�s casos, devuelve falso.
Si el par�metro hourOfDay es menor que 	, devuelve falso.
Ejemplos de entrada / salida:
* shouldWakeUp (verdadero, 1); ? deber�a volver verdadero
* shouldWakeUp (falso, 2); ? debe devolver falso ya que el perro no est� ladrando.
* shouldWakeUp (verdadero, 8); ? deber�a devolver falso, ya que no es antes de 8.
* shouldWakeUp (verdadero, -1); ? debe devolver falso ya que el par�metro hourOfDay debe estar en un rango de 0 a 23.
SUGERENCIA: Utilice la declaraci�n if else con varias condiciones.
NOTA: El m�todo shouldWakeUp debe definirse como est�tico p�blico como lo hemos estado haciendo hasta ahora en el curso.
NOTA: No agregue un m�todo principal al c�digo de la soluci�n.
 */
package com.java.basic;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		shouldWakeUp (true, 1);		
	}

	public static boolean shouldWakeUp(boolean ladrido, int hourOfDay) {
		boolean r = false; 		
			if(ladrido){
				{if (hourOfDay>=0 && hourOfDay <=23) {
						r =true; 
						//System.out.println("la hora es correcta");
						if (hourOfDay<8 || hourOfDay >22) {
							System.out.println("el perro esta ladrando");
						}else {
							System.out.println("no es antes de las 8 horas o despues de las 22 horas");
						}
							
				}else {
					System.out.println("la hora es incorrecta");
				}
				}
			}else {
				r =false;
				System.out.println("El perro no esta ladrando");
				}
			return r;		
	}

	
		
}


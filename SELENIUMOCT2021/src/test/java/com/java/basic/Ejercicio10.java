// perro ladra
/*
 * Tenemos un perro al que le gusta ladrar. ¡Necesitamos despertarnos si el perro ladra por la noche!
Escriba un método shouldWakeUp que tenga 2 parámetros.
El primer parámetro debe ser de tipo booleano y debe llamarse ladrido, representa si nuestro perro está ladrando actualmente.
El segundo parámetro representa la hora del día y es de tipo int con el nombre hourOfDay y tiene un rango válido de 0-23.
Tenemos que despertarnos si el perro está ladrando antes de las 8 o después de las 22 horas para que en ese caso vuelva verdadero.
En todos los demás casos, devuelve falso.
Si el parámetro hourOfDay es menor que 	, devuelve falso.
Ejemplos de entrada / salida:
* shouldWakeUp (verdadero, 1); ? debería volver verdadero
* shouldWakeUp (falso, 2); ? debe devolver falso ya que el perro no está ladrando.
* shouldWakeUp (verdadero, 8); ? debería devolver falso, ya que no es antes de 8.
* shouldWakeUp (verdadero, -1); ? debe devolver falso ya que el parámetro hourOfDay debe estar en un rango de 0 a 23.
SUGERENCIA: Utilice la declaración if else con varias condiciones.
NOTA: El método shouldWakeUp debe definirse como estático público como lo hemos estado haciendo hasta ahora en el curso.
NOTA: No agregue un método principal al código de la solución.
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


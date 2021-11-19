// area
/*
 * Escriba un m�todo llamado �rea con un par�metro doble llamado radio.
El m�todo debe devolver un valor doble que represente el �rea de un c�rculo.
Si el radio del par�metro es negativo, devuelve -1.0 para representar un valor no v�lido.
Escribe otro m�todo sobrecargado con 2 par�metros xey (ambos dobles), donde xey representan los lados de un rect�ngulo.
El m�todo debe devolver un �rea de un rect�ngulo.
Si uno o ambos par�metros es / son negativos, devuelve -1.0 para indicar un valor no v�lido.
Para conocer las f�rmulas y el valor de PI, consulte los siguientes consejos.
Ejemplos de entrada / salida:
* �rea (5,0); deber�a devolver 78.53975
* �rea (-1); deber�a devolver -1 ya que el par�metro es negativo
* �rea (5,0, 4,0); deber�a devolver 20.0 (5 * 4 = 20)
* �rea (-1,0, 4,0); deber�a devolver -1 ya que primero el par�metro es negativo

SUGERENCIA: La f�rmula para calcular el �rea de un rect�ngulo es x * y.
SUGERENCIA: La f�rmula para calcular el �rea de un c�rculo es radio * radio * PI.
SUGERENCIA: Para PI, use una constante de la clase de matem�ticas, p. Ej. Math.PI
NOTA: Todos los m�todos deben definirse como est�ticos p�blicos, como lo hemos estado haciendo hasta ahora en el curso.
NOTA: �No agregue un m�todo principal a su c�digo de soluci�n!
 */
package com.java.basic;

public class Ejercicio9 {

	public static void main(String[] args) {

		�rea(5.0);
		
	}
	public static void �rea(double radio) {
		if (radio>=1) {
			System.out.println(radio *radio*Math.PI);
		}else {
			System.out.println("-1 valor no v�lido.");
		}
	}
	
	public static void �rea(double x ,double y) {
		if ( x >= 1 && y >= 1  ) {
			System.out.println(x *y);
		}else {
			System.out.println("-1 valor no v�lido.");
		}
	}
	
}

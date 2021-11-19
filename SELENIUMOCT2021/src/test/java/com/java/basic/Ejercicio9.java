// area
/*
 * Escriba un método llamado área con un parámetro doble llamado radio.
El método debe devolver un valor doble que represente el área de un círculo.
Si el radio del parámetro es negativo, devuelve -1.0 para representar un valor no válido.
Escribe otro método sobrecargado con 2 parámetros xey (ambos dobles), donde xey representan los lados de un rectángulo.
El método debe devolver un área de un rectángulo.
Si uno o ambos parámetros es / son negativos, devuelve -1.0 para indicar un valor no válido.
Para conocer las fórmulas y el valor de PI, consulte los siguientes consejos.
Ejemplos de entrada / salida:
* área (5,0); debería devolver 78.53975
* área (-1); debería devolver -1 ya que el parámetro es negativo
* área (5,0, 4,0); debería devolver 20.0 (5 * 4 = 20)
* área (-1,0, 4,0); debería devolver -1 ya que primero el parámetro es negativo

SUGERENCIA: La fórmula para calcular el área de un rectángulo es x * y.
SUGERENCIA: La fórmula para calcular el área de un círculo es radio * radio * PI.
SUGERENCIA: Para PI, use una constante de la clase de matemáticas, p. Ej. Math.PI
NOTA: Todos los métodos deben definirse como estáticos públicos, como lo hemos estado haciendo hasta ahora en el curso.
NOTA: ¡No agregue un método principal a su código de solución!
 */
package com.java.basic;

public class Ejercicio9 {

	public static void main(String[] args) {

		área(5.0);
		
	}
	public static void área(double radio) {
		if (radio>=1) {
			System.out.println(radio *radio*Math.PI);
		}else {
			System.out.println("-1 valor no válido.");
		}
	}
	
	public static void área(double x ,double y) {
		if ( x >= 1 && y >= 1  ) {
			System.out.println(x *y);
		}else {
			System.out.println("-1 valor no válido.");
		}
	}
	
}

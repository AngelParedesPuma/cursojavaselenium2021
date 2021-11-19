package com.java.basic;

public class algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		confirmarsuma(2, 2, 4);	
		System.out.println("La suma es "+suma(5,3));	
		System.out.println("La resta es "+resta(100,99));	
}
	
public static String holamundo() {
	System.out.println("imprime");
	return "hola mundo";
}
public static int suma(int x, int y) {
	System.out.println (holamundo());
	int suma =x+y;
	return suma;
}

public static int resta (int x, int y){
	return x-y;		
}
public  static void confirmarsuma(int x , int y, int sumatotal) {
	if (sumatotal==suma(x,y))
	System.out.println("se confirma la suma que es correcta");
	else 
		System.out.println("se confirma la suma que es incorrecta");
	}


}

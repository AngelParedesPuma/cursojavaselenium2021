package com.java.basic;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//loops
		//while
		//do while
		//for
		
		
		//while
		
		int numero =1; 
		while(numero<=10) {
			System.out.println("contador: "+ numero);
			++numero;
		}
		System.out.println("fin loop");

//do while
	//cuantas veces se tiene que sumar un mismo numero para 
	//llegar a 100
	
	int numLimite=5;
	int sumtotal =0;
	int count = 0;
	do {
		sumtotal= sumtotal + numLimite;
		++count;
		
	}while(sumtotal<100);
	System.out.println("fin loop" + count);
	
	//for
	
	int numerofor =10;
	for (int i=1;i <=numerofor; i++) {
		System.out.println("el numero for es" + i);
	}
		
 }
	
	
}

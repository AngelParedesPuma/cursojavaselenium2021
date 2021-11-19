package com.java.polimorfismo;

public class Main {

	public static void main(String[] args) {
	
		Animal ricardo = new Humano();
		ricardo.speeker();
		ricardo= new Perro();
		ricardo.speeker();
		ricardo= new Gato();
		ricardo.speeker();
	}

}

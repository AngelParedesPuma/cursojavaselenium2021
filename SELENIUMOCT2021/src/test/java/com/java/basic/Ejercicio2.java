package com.java.basic;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		isCatPlaying(false, 35);
	}
/*	
Los gatos pasan la mayor parte del d�a jugando. En particular, juegan si la temperatura est� entre 25 y 35 grados (incluyendo), 
a menos que sea verano y el l�mite superior sea 45 grados (incluyendo) en lugar de 35.
Escriba un m�todo llamado isCatPlaying que tenga 2 par�metros. El m�todo debe devolver �True� si el gato esta jugando, de lo contrario, devolver �False�.
El primer par�metro debe ser de tipo boolean y debe llamarse "verano" que representa s� es verano.
El segundo par�metro representa la temperatura y es de tipo int con el nombre �temperatura".
isCatPlaying (verdadero, 10); debe devolver falso ya que la temperatura no esta en el rango de 25 a 45.
isCatPlaying (falso, 36); debe devolver falso ya que la temperatura no esta en el rango de 25 a 35 (el par�metro de verano es falso).
isCatPlaying (falso, 35); deber�a volver a verdadero ya que la temperatura esta en el rango de 25 a 35.
*/


static boolean isCatPlaying(boolean verano, int temperatura)
{
    if(verano)
    	{
    	int TempMaxVerano =45;
    	if (temperatura>=25  && temperatura<= TempMaxVerano) {
        System.out.println("Resp 1 los gatos estan jugando ya que la temperatura  esta en el rango de 25 a 45");
    	}else{
    		System.out.println("Resp 2 los gatos NO estan jugando ya que la temperatura NO esta en el rango de 25 a 45");
         }
    	}
    else if (temperatura>=25  && temperatura<= 35) {
        System.out.println("Resp 3 los gatos estan jugando ya que la temperatura  esta en el rango de 25 a 35");
    	}else{
    		System.out.println("Resp 4 los gatos NO estan jugando ya que la temperatura NO esta en el rango de 25 a 35");
         }
    return verano;
}


}

package com.java.basic;

public class Ejercicio5 {
/*
 * Crea un método “isLeapYear” con un parámetro de tipo “int” llamado “year”.
El parametro necesita ser mayor que o igual a 1 y menor o igual a 9999.
Si el parametro no esta en ese rango regresa el método “FALSE”.
Por otro lado, si esta dentro del rango valido, calcular si el año es un año bisiesto y regresa “TRUE” si es año bisiesto, por otro lado “FALSE”.
Para determinar cual año es bisiesto, sigue los siguientes pasos:
1 Si el año es divisible de 4, sigue al siguiente paso.
2 Si no es divisible de 4, sigue al paso 5. Si el año es divisible de 100, sigue al siguiente paso.
3 Si no es divisible de 100, sigue al paso 5. Si el año es divisible de 400, sigue al siguiente paso.
4 Si no es divisible de 400, sigue al paso 5. El año es un año bisiesto (tiene 366 días). El método isLeapYear necesita regresar “TRUE”.
5 El año no es un año bisiesto (tiene 365 días). El método isLeapYear necesita regresar “FALSE”.

EJEMPLOS DE ENTRADA Y SALIDA:
* isLeapYear(-1600); FALSE
* isLeapYear(1600); TRUE
* isLeapYear(2017); FALSE
* isLeapYear(2000);  TRUE

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	isLeapYear(2020);
	//isLeapYear2(2020);
	}

	public static boolean isLeapYear( int year) {
	boolean res; 
		if(year>=1 && year <=9999 && year % 4 == 0 &&  year % 100 !=0|| year % 100 == 0 && year % 400 == 0)
	{ res =true;
				System.out.println("El año es un año bisiesto (tiene 365 días)");
	}else { res =false;
		System.out.println("El año no es un año bisiesto (tiene 365 días)");
	      }
		return res;
	}
	
	
	/*
	  public static boolean isLeapYear2(int anio) {
			 
		    return (anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0);
		}
	*/	
	
	
	/*
	 * public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            int divisible = year % 4;
            if( divisible == 0){
                divisible = year % 100;
                if(divisible == 0) {
                    divisible = year %400;
                    if(divisible==0){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
	 * 
	 * 
	 * 
	 */
		
		
}


	



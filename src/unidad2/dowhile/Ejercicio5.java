package unidad2.dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	int min = 1;
	int max = 101;
	String resultado;
	
	Scanner teclado = new Scanner(System.in);
	
	Random generadorAleatorio = new Random();
	
	do {int numeroEntero = generadorAleatorio.nextInt(min, max);
		System.out.println("¿Su número es menor que  " + numeroEntero + ", mayor, o son iguales");
		resultado = teclado.next();
		if (resultado.equals("menor")){
			max = numeroEntero;
			
		}else if (resultado.equals("mayor")){
			min=numeroEntero;
			
		}
	}while (!resultado.equals("iguales"));
	System.out.println("Son iguales");
	
	
	
	
	

	}

}

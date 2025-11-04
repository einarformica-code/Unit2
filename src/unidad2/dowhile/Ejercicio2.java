package unidad2.dowhile;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
			
	int numero=2;
	//Inicializamos número con el primer valor par posible, 2.
	do {
		System.out.println(numero);
		//Imprimimos el número
		numero +=2;
		//Incrementamos su valor en 2.
		
	}while(numero<=200);
	//Mientras que sea menor de 200.
	
	
	}
}

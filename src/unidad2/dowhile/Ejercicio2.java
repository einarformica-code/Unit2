package unidad2.dowhile;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
	
	Scanner teclado = new Scanner(System.in);
	
	int numero=2;
	
	do {
		System.out.println(numero);
		numero +=2;
		
	}while(numero<=200);
	
	
	}
}

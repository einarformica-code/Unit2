package tema2.ejercicios_condicionales;

import java.util.Scanner;

public class pruebascondicional {
	public static void main(String[] args) {
		int num;
		int numMedioIzq;
		int numMedioDer;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numero cuatro cifras");
		num = teclado.nextInt();
		numMedioDer= num/100 ;
		System.out.println(numMedioDer);
	}

}

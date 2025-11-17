package tema2.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
	
	Scanner teclado = new Scanner(System.in);
	int numIntro;
	
	
	
	do {
	System.out.println("Número 1-20");
	numIntro=teclado.nextInt();
	}while (numIntro < 1 || numIntro>20);
	
	
	
	
	
	
	//introduci,os numero
	do{for ( int contadorIndividual=0; contadorIndividual!=numIntro; contadorIndividual++) {
		System.out.print(numIntro);
	}//cierre for
	System.out.println();
	--numIntro;}while(numIntro>=1);
	
	
	
	
	
	
	
	}//cierre main

}

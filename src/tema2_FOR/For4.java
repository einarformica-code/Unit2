package tema2_FOR;

import java.util.Scanner;

public class For4 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	//creamos un scanner
	
	//Diseñar un programa que muestre la suma de los 10 primeros números impares.
	int contadorImpar=0;
	int contadorNumero;
	int sumaImpares = 0;
	
	for (contadorNumero=0; contadorImpar<10; contadorNumero++) {
		
		if (contadorNumero %2 !=0) {
			contadorImpar++;
			sumaImpares += contadorNumero;
		}
		
	}
	System.out.println("La suma de los 10 primeros números impares es " + sumaImpares);
	
	
}
}

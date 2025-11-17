package boletin6.for00;

import java.util.Scanner;

public class For3 {
public static void main(String[] args) {
	//Pedir diez números por teclado y mostrar la media.
	Scanner teclado = new Scanner(System.in);
	int numeroIntroducir;
	
	int sumaNumeros=0;
	
	
	for ( int contadorNumeros=0; contadorNumeros<10; contadorNumeros++) {
		
		System.out.println("Introduzca un número");
		numeroIntroducir = teclado.nextInt();
		sumaNumeros+=numeroIntroducir;
	}
	int media = sumaNumeros/ 10;
	System.out.println("La media es " + media);
	
	
}
}

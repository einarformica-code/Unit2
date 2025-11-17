package boletin6.for00;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		//Creamos scanner
		Scanner teclado = new Scanner(System.in);
		
		
		//Número que se introducirá
		
		int numero;
		
		//Pedimos número
		
		System.out.println("Introduzca número");
		numero=teclado.nextInt();
		
		for ( int contador=1; contador<=numero; contador ++) {
			//Mientras que el contador, inicializado en 1, sea menor que número se imprimirá el contador y se incrementará su valor en uno.
			System.out.println(contador);}
		
		teclado.close();
		
	}

}

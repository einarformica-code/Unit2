package boletin1.ifelse;

import java.util.Scanner;

public class Ordinograma7 {
	public static void main(String[] args) {
		int n1;
		//Primer número a leer
		int n2;
		//Segundo numero a leer
		
		Scanner teclado = new Scanner(System.in);
		//Creación de Scanner
		
		System.out.println("Introduzca primer número y segundo número en orden consecutivo");
		n1 = teclado.nextInt();
		n2=teclado.nextInt();
		//Pedimos los dos primeros números.
		
		if(n1==n2) {
			//Si n1 y n2 son iguales:
			System.out.println("Los dos números deben ser diferentes para ser comparados");
			//Imprimir resultado
		}else if (n1>n2) {
			//Si n1 es mayor que n2
			System.out.println("N1 es mayor que N2");
			//Imprimir resultado

			}else {
			//Si no es ninguno de los 2 casos anteriores:
				System.out.println("N2 es mayor que N1");
				//Imprimir que N2 es mayor que N1
			
		}//Cierre else if
		
		
	}

}

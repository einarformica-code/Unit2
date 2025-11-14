package boletin1.ifelse;

import java.util.Scanner;

public class Ordinograma8 {
	public static void main(String[] args) {
		
		int n1;
		//Primer número a leer
		int n2;
		//Segundo numero a leer
		
		int n3;
		//Tercer numero a leer
		
		Scanner teclado = new Scanner(System.in);
		//Creación de Scanner
		
		System.out.println("Introduzca primer número, segundo y tercer número en orden consecutivo");
		n1 = teclado.nextInt();
		n2=teclado.nextInt();
		n3=teclado.nextInt();
		//Pedimos los tres primeros números.
		
		
		if (n1>n2 && n1>n3) {
			//Si n1 es mayor que n2 y que n3:
			System.out.println("N1 es el mayor");
			//Imprimir resultado
			}else if (n2>n1 && n2>n3) {
				//Si n2 es mayor que n1 y n3
				System.out.println("N2 es el mayor");
				//Imprimir el resultado
			}else if (n3>n1 && n3>n2) {
				//Si n3 es mayor que n1 y n2
				System.out.println("N3 es el mayor");
				//Imprimir el resultado
			}else {
				//Si ninguno es 
				System.out.println("Los 3 números son iguales");
			}
		
	}

}

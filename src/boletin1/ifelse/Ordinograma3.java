package boletin1.ifelse;

import java.util.Scanner;

public class Ordinograma3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos n1 y n2
		int n1;
		int n2;
		//Pedimos n1 y n2
		System.out.println("Introduzca primer número");
		n1 = teclado.nextInt();
		System.out.println("Introduzca segundo número");
		n2 = teclado.nextInt();
		
		//Declaramos operaciones entre n1 y n2
		int division = n1 / n2;
		int multiplicacion = n1 * n2;
		int suma = n1 + n2;
		int resta = n1 - n2;
		
		//Si n2 es 0, no se realizará la división. Si n2 no es 0 se realizan todas las operaciones.
		if  (n2 == 0) {
			System.out.println("La suma es" + suma + ", la resta es " + resta + ",la multiplicación es" + multiplicacion +". La división no se puede realizar si el segundo número es 0");
		}
		else { System.out.println("La suma es " + suma + ", la resta del segundo numero al primero es " + resta + ",la multiplicación es " + multiplicacion + " y la division entre el primer y el segundo número es " + division);
		}
		teclado.close();
	}

}

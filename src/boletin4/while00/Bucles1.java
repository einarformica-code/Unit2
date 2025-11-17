package boletin4.while00;

import java.util.Scanner;

public class Bucles1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		//Inicializamos la suma dándole valor 0, donde se almacenará el sumatorio de los números.
		
		System.out.println("Introduzca un número");
		int numeroIntroducido= teclado.nextInt();
		//Pedimos un número
		
		while (numeroIntroducido>0) {
			//Mientras que el número introdudicdo sea positivo se realizarán estas operaciones:
			suma+=numeroIntroducido;
			//le asignamos a suma el valor actual con el número introducido.
			
			System.out.println("Introduzca un número");
			 numeroIntroducido= teclado.nextInt();
			//volvemos a pedir el número, de forma que si se sigue cumpliendo la condición se siguen ejecutando las instrocciones contenidas.
		}
		if (suma<0) {
			System.out.println("No ha introducido ningún número positivo");
			//Si el primer número introducido es menor que 0, no hay números positivos que sumar
		}else {
		System.out.println("La suma de todos los números introducidos es " + suma);
		}
		
	}

}

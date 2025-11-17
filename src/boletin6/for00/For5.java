package boletin6.for00;

import java.util.Scanner;

public class For5 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int multiplicacion = 1;

		// inicializamos multiplicacion con valor 0
		System.out.println("Introduzca un número del que hacer el factorial");
		int numeroBase = teclado.nextInt();


		System.out.print("!" + numeroBase + " =");
		for (int numeroNuevo = numeroBase; numeroNuevo > 0; --numeroNuevo) {
			System.out.print(numeroNuevo);
			if (numeroNuevo != 1) {
				System.out.print("*");
			} // cierre if
			
			multiplicacion *= numeroNuevo;

		} // cierre for
		System.out.print(" = " + multiplicacion);
	}

}

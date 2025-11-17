package boletin6.for00;

import java.util.Scanner;

public class For7 {
	public static void main(String[] args) {
		int numeroIntroducido;
		int comprobante;
		boolean primo = true;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número");
		numeroIntroducido = teclado.nextInt();

		for (comprobante = 2; (comprobante < numeroIntroducido && primo == true); comprobante++) {

			if (numeroIntroducido % comprobante == 0) {
				primo = false;
			} 

		} // Cierre for

		if (primo == true) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

	}// cierre main

}// cierre clase

package ordinogramas;

import java.util.Scanner;

public class Ordinograma5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;
		System.out.println("Introduczca un número");
		numero = teclado.nextDouble();
		
		if (numero >=0) {System.out.println("su número es positivo");
		
		}
		else {
				System.out.println("Su número es negativo");
		
				}
	}

}

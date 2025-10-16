package ordinogramas;

import java.util.Scanner;

public class Ordinograma4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Introduzca n1");
		n1 = teclado.nextInt();

		System.out.println("Introduzca n2");
		n2 = teclado.nextInt();

		if (n1 == n2) {
			System.out.println("Los dos números son iguales");
		} else if (n1 > n2) {
			System.out.println("N1 es mayor");
		} else {
			System.out.println("N2 es mayor");
		}
	}
}

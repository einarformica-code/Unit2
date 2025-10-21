package tema2.ifelse;

import java.util.Scanner;

public class UdEjercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		int n3;
		int sumaN1N2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("n1?");
		n1=teclado.nextInt();
		
		System.out.println("¿n2?");
		n2=teclado.nextInt();
		
		System.out.println("¿N3?");
		n3=teclado.nextInt();
		
		sumaN1N2 = n1 + n2;
		
		if (sumaN1N2==n3) {
			System.out.println("La suma de los dos primeros numeros equivale al tercero");
		}
		else {
			System.out.println("La suma de los dos primeros numeros NO equivale al tercero");

		}
		
		
	}

}

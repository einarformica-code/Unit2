package ejerciciosswitch;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int nota;
		
		System.out.println("introduczca nota del 1 al 10");
		nota=teclado.nextInt();
		
		switch (nota) {
		case 1, 2, 3, 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("No es una nota válida");
		}

	}

}

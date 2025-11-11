package tema2_FOR;

import java.util.Scanner;

public class For8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroA;
		int numeroB;
		
		System.out.println("Escrib a numero A ");
		numeroA=teclado.nextInt();
		
		System.out.println("Escrib a numero B ");
		numeroB=teclado.nextInt();
		
		if (numeroA < numeroB) {
			for(int contador=numeroA; contador<=numeroB; contador++) {
				System.out.print(contador + " ");
			}
		}

		
	}
}

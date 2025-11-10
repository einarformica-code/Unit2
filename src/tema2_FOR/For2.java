package tema2_FOR;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int contadorMultiplos3=0;
		
		System.out.println("¿Número?");
		numero= teclado.nextInt();
		
		for (int multiplos=0; multiplos < numero; multiplos+=3 ) {
		contadorMultiplos3++;
			
		}
		System.out.println(contadorMultiplos3);
		
		teclado.close();
	}
 
}

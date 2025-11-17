package boletin5.dowhile;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int multiplicador = 1;
		int numUsuario;
		int resultado;
		
		System.out.println("Diga un número");
		numUsuario =teclado.nextInt();
		
		do {
			resultado = numUsuario * multiplicador;
			
			System.out.println(numUsuario + "*" + multiplicador + "=" + resultado);
			
			multiplicador++;
			
		}while (multiplicador <=10);
		
		teclado.close();
	}

}

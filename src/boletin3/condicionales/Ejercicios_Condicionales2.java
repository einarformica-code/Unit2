package boletin3.condicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;
		double resultado;
		boolean negativo;
		
		System.out.println("Introduzca un número, positivo o negativo");
		numero = teclado.nextDouble();
		negativo = numero < 0;
		
		resultado = negativo ? (-numero) : (numero);
		
		System.out.println(resultado);
		

	}

}

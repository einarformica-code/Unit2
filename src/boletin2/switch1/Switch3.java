package boletin2.switch1;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		String respuesta;
		int num1;
		int num2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca n1");
		num1 = teclado.nextInt();

		System.out.println("Introduzca n2");
		num2 = teclado.nextInt();

		System.out.println(
				"Seleccione una opción: a.Sumar los numeros. b.Restar los numeros c.Multiplicar los numeros d.Dividir los numeros");
		respuesta = teclado.next();

		switch (respuesta) {
		case "a":
		int suma = num1 + num2;
		System.out.println(suma);
		break;
		case "b":
		int resta = num1-num2;
		System.out.println( resta );
		break;
		case "c":
		int multiplicacion= num1*num2;
		System.out.println(multiplicacion);
		break;
		case "d":
			if (num2==0) {
				System.out.println("No se puede dividir entre 0");
			}else {
				int division = num1/num2;
				System.out.println(division);
				break;
				
			}
		
		}
	}

}

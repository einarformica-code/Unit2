package boletin1.ifelse;

import java.util.Scanner;

public class Ordinograma2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos edad
		int edad;
		//Declaramos mayoría de edad
		boolean mayorEdad;
		//Pedimos edad
		System.out.println("Introduzca su edad");
		//Edad será introducidad por teclado
		edad = teclado.nextInt();
		mayorEdad = edad >= 18;
		
		//Si la edad es mayor a 18, usuario es mayor de edad.
		if(mayorEdad){System.out.println("Eres mayor de edad");
		}
		//Si la edad no es mayor o igual a 18, es menor de edad.
		else {System.out.println("No eres mayor de edad");
			}
		teclado.close();
		}
		
		
	}



package boletin4.while00;

import java.util.Scanner;

public class bucles_6 {
	public static void main(String[] args) {
		double altura;
		
		double alturaMaxima = 0;
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Introduzca la altura");
		altura = keyboard.nextDouble();
		
		
		while (altura!=-1) {
			if (altura>alturaMaxima) {
				alturaMaxima = altura;
			}
			System.out.println("Introduzca la altura");
			altura = keyboard.nextDouble();
		}
		if (alturaMaxima == -1) {
			System.out.println("No has introducido ninguna altura");
			
		}else {
		System.out.println("Altura maxima  es " + alturaMaxima);
		}
	}

}

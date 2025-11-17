package boletin5.dowhile;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		String primeraTirada;
		String segundaTirada;
		int valorNumPrimeraTirada=0;
		int valorNumSegundaTirada=0;
		int valorNumTotal;
		
		Scanner teclado= new Scanner(System.in);
		do {
		System.out.println("¿Cuánto has sacado en tu primera tirada?");
		primeraTirada = teclado.next();
		
		switch(primeraTirada){
		case "Uno":
			valorNumPrimeraTirada=1;
			break;
		case "Dos":
			valorNumPrimeraTirada=2;
			break;
		case "Tres":
			valorNumPrimeraTirada=3;
			break;
		case "Cuatro" :
			valorNumPrimeraTirada=4;
			break;
		case "Cinco":
			valorNumPrimeraTirada=5;
			break;
		case "Seis" :
			valorNumPrimeraTirada=6;
			break;}
		}while(!primeraTirada.equals("Uno") && !primeraTirada.equals("Dos") &&
				!primeraTirada.equals("Tres") && !primeraTirada.equals("Cuatro") && 
				!primeraTirada.equals("Cinco") && !primeraTirada.equals("Seis") );
		//repetir el bucle mientras que la segunda tirada no equivalga a Uno, Dos, Tres, Cuatro, Cinco o Seis 

		do{
		System.out.println("¿Cuánto has sacado en tu segunda tirada?");
		segundaTirada = teclado.next();
		switch(segundaTirada){
		case "Uno":
			valorNumSegundaTirada=1;
			break;
		case "Dos":
			valorNumSegundaTirada=2;
			break;
		case "Tres":
			valorNumSegundaTirada=3;
			break;
		case "Cuatro" :
			valorNumSegundaTirada=4;
			break;
		case "Cinco":
			valorNumSegundaTirada=5;
			break;
		case "Seis" :
			valorNumSegundaTirada=6;
			break;}
		}while (!segundaTirada.equals("Uno") && !segundaTirada.equals("Dos") &&
				!segundaTirada.equals("Tres") && !segundaTirada.equals("Cuatro") &&
				!segundaTirada.equals("Cinco") && !segundaTirada.equals("Seis") );
		//repetir el bucle mientras que la segunda tirada no equivalga a Uno, Dos, Tres, Cuatro, Cinco o Seis 
		valorNumTotal = valorNumPrimeraTirada + valorNumSegundaTirada;
		System.out.println("La suma de las dos tiradas es " + valorNumTotal);
		
		
	}
}

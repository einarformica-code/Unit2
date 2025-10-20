package ejerciciosswitch;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String primeraTirada;
		String segundaTirada;
		int valorNumPrimeraTirada=0;
		int valorNumSegundaTirada=0;
		int valorNumTotal;
		
		Scanner teclado= new Scanner(System.in);
		
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
		
		valorNumTotal = valorNumPrimeraTirada + valorNumSegundaTirada;
		System.out.println("La suma de las dos tiradas es " + valorNumTotal);
		
		
		
	}

}

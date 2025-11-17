package boletin3.condicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales3 {
	public static void main(String[] args) {
		int dni;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca las cifras de su DNI");
		dni= teclado.nextInt();
		
		int operacionLetra= dni % 23;
		char letra ;
		switch (operacionLetra) {
		case 0 -> letra = 'T';
		case 1-> letra = 'R';
		case 2-> letra = 'W';
		case 3-> letra = 'A';
		case 4-> letra = 'G';
		case 5-> letra = 'M';
		case 6-> letra = 'Y';
		case 7-> letra = 'F';
		case 8-> letra = 'P';
		case 9-> letra = 'D';
		case 10-> letra = 'X';
		case 11-> letra = 'B';
		case 12-> letra = 'N';
		case 13-> letra = 'J';
		case 14-> letra = 'Z';
		case 15-> letra = 'S';
		case 16-> letra = 'Q';
		case 17-> letra = 'V';
		case 18-> letra = 'H';
		case 19-> letra = 'L';
		case 20-> letra = 'C';
		case 21-> letra = 'K';
		default -> letra='E' ;
								};
		System.out.println(letra);
		
		
		
		
	}

}

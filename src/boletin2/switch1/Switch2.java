package boletin2.switch1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numDia;
		
		System.out.println("Diga un número correspondiente a un dia de la semana");
		numDia = teclado.nextInt();
		switch (numDia) {
		case 1:
			System.out.println("Es Lunes");
			break;
		case 2: 
			System.out.println("Es Martes");
			break;
		case 3:
			System.out.println("Es Miércoles");
			break;
		case 4:
			System.out.println("Es Jueves");
			break;
		case 5:
			System.out.println("Es Viernes");
		case 6:
			System.out.println("Es Sábado");
			break;
		case 7:
			System.out.println("Es Domingo");
			break;
			default:
				System.out.println("No es un número válido");
		}
		
	}

}

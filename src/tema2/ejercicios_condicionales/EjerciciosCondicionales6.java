package tema2.ejercicios_condicionales;

import java.util.Scanner;

public class EjerciciosCondicionales6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int año;
		int mes;
		int diasMes;
		
		
		
		System.out.println("Dime que año es");
		año = teclado.nextInt();
		boolean bisiesto = año % 4== 0;
		
		System.out.println("Mes");
		mes = teclado.nextInt();
		
		diasMes = switch (mes) {
		case 1-> {
			yield 10;
		}
		case 2->{
			yield 28;
		}
		case 3->{
			yield 31;
		}
		case 4->{
			yield 30;
		}
		case 5 ->{
			yield 31;
		}
		case 6->{
			yield 30;
			}
		case 7->{
			yield 31;s
		}
		};
		
	}

}

package tema2.ifelse;

import java.util.Scanner;

public class Ud2ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double número;
		
		System.out.println("Introduzca un numero");
		número = teclado.nextDouble();
		
		
		if (número > -1 && número != 0 && número <1)
			{
			System.out.println("Su número  es casi cero");
			}
		else 
			{
			System.out.println("Su número no es casi cero");
			}
		teclado.close();
		

	}

}

package tema2.ifelse;

import java.util.Scanner;

public class Ud2ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double cifra = 0;
		double numero ;
		int cifraEntera = 0;
		System.out.println("Digame un número");
		numero = teclado.nextDouble();
		if (numero == 0) 
			{
			System.out.println("Es de 1 cifra");
			}
		else {
			cifra = Math.log10(numero);
			cifraEntera = (int) cifra +1;
			
			System.out.println(cifraEntera);
			}
		teclado.close();
		
		
		
		
		
		
		

	}

}

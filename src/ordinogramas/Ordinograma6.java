package ordinogramas;

import java.util.Scanner;

public class Ordinograma6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int mayor;
		int n1;
		int n2;
		int n3;
		System.out.println("N1");
		n1 = teclado.nextInt();
		
		System.out.println("N2");
		n2 = teclado.nextInt();
		
		System.out.println("N3");
		n3 = teclado.nextInt();
		
		if (n1 > n2 && n1 > n3) 
			{System.out.println("N1 es el mayor");
				}
		else if (n2>n1 && n2>n3) 
			{System.out.println("N2 es mayor");
			}
		else {
			System.out.println("N3 es el mayor");
			}
		}
		
		


}

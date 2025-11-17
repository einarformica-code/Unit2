package boletin6.for00;

import java.util.Scanner;

public class For8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroA;
		int numeroB;
		int menor;
		int mayor;
		
		System.out.println("Escrib a numero A ");
		numeroA=teclado.nextInt();
		
		System.out.println("Escrib a numero B ");
		numeroB=teclado.nextInt();
		
		if(numeroA>numeroB) {
			mayor = numeroA;
			menor = numeroB;
		}else  if (numeroB>numeroA){
			mayor = numeroB;
			menor= numeroA;
		}else {
			menor=0;
			mayor=0;
			System.out.println("Los dos numeros son iguales");
		}
		
		
		if (menor <mayor) {
			for(int contador=menor; contador<=mayor; contador++) {
				System.out.print(contador + " ");
			}
		}

		
	}
}

package tema2.ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un número entre 0 y 9999");
		num=teclado.nextInt();
		
		if (num<10) {
			System.out.println("Es capicua");
		}else if (num>=10 && num<100) {
			if (num/10 == num%10) {
				System.out.println("Es capicua");
			}else {System.out.println("No es capicua");
			
			}
			
		}else if (num>=100 && num<1000) {
			if(num/100 ==num%10) {
				System.out.println("Es capicua");
			}else {
				System.out.println("No es capicua");
			}
		}else if (num>=1000 && num<10000) {
			
		}
			
		
		
		

	}

}

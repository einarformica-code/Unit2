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
			int n1= num%10;
			int n2=((num%100) -n1)/10; 
			//N2 es el segundo número leyendo de derecha a izquierda. Equivale al resto el INPUT resultante de ser dividido entre 100 MENOS n1(el primer numero de derecha a izquierda)
			int n3= (num%1000 - n2)/100;
			int n4=num/1000;
			if (n1==n4 && n2==n3) {
				System.out.println("El numero es capicua");
			}else {
				System.out.println("El número no es capicua");
			}
			
		}else {
			System.out.println("El número no entra en el rango definido");
		}
			
		
		
		

	}

}

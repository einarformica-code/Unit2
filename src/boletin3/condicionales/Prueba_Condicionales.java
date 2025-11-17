package boletin3.condicionales;

import java.util.Scanner;

public class Prueba_Condicionales {
	public static void main(String[] args) {
		int numero;
		int n1;
		int n2;
		int n3;
		int n4;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número 4 cifras");
		numero = teclado.nextInt();
		
		n1= numero%10;
		n2=((numero%100) -n1)/10; 
		n3= (numero%1000 - n2)/100;
		n4=numero/1000;
		
		
		System.out.println(n3);
	}

}

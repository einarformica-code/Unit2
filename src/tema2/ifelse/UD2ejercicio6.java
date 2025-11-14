package tema2.ifelse;

import java.util.Scanner;

public class UD2ejercicio6 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n1;
	int n2;
	int n3;
	int sumaN1N2;
	System.out.println("Escriba n1");
	n1=teclado.nextInt();
	
	System.out.println("Escriba n2");
	n2=teclado.nextInt();
	
	System.out.println("Escriba n3");
	n3=teclado.nextInt();
	
	sumaN1N2= n1 + n2;
	
	if(sumaN1N2 == n3) {
		System.out.println("La suma de los dos primeros equivale al tercer número");
	}else {
		System.out.println("La suma de los dos primeros números no equivale al tercer número");
	}
}
}

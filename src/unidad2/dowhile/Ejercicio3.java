package unidad2.dowhile;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int suma = 0;
	int contador = 1;
	
	int numeroUsuario;
	
	System.out.println("Introduzca un número");
	numeroUsuario = teclado.nextInt();
	do {
	suma += contador;
	contador++;
	}while (contador <= numeroUsuario);
	
	System.out.println("La suma es " + suma);
	
	teclado.close();
	
	
}
}

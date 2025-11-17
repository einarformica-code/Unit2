package boletin4.while00;

import java.util.Scanner;

public class Bucles2 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int contador=0;
	//inicializamos el contador en 0, que aumentará cada vez que se introduzca un número
	
	System.out.println("Introduzca un número");
	int numero = teclado.nextInt();
	
	//el valor de la variable número será asignada por el usuario
	
	while(numero!=-1) {
		//Mientras que el número sea distinto que 0:
		++contador;
		//se incrementa el valor de contador en 1
		
		System.out.println("Introduzca un número");
		numero=teclado.nextInt();
		//volvemos a pedir el número y se vuelve a comprobar la condición
		
		
	}//cierre de while
	
	if (contador==0) {
		System.out.println("No has introducido ningún número positivo.");
		//si el contador no se ha incrementado ninguna vez es porque no se ha entrado en el bucle
	}else {
		System.out.println("Has introducido " + contador + " números positivos");
		//Si se han registrado varios números positivos, se mostrarán cuantos.
	}
	teclado.close();
}
}

package boletin4.while00;

import java.util.EnumMap;
import java.util.Scanner;

public class bucles_5 {
public static void main(String[] args) {
	int sumaEdades=0;
	int numAlumnos=0;
	int mayoresEdad=0;
	int media;
	
	
	int edad;
	
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Introduzca la edad");
	edad = keyboard.nextInt();
	
	while (edad >=0) {
		sumaEdades +=edad;
		numAlumnos++;
		if(edad>=18) {
			mayoresEdad++;
		}
		System.out.println("Introduzca la edad");
		edad = keyboard.nextInt();
		
	}
	media = sumaEdades / numAlumnos;
	System.out.println("La media es  " + media);
	System.out.println("La suma de las edades es " + sumaEdades);
	System.out.println("Hay " + mayoresEdad + " mayores de edad");
	System.out.println("Hay " + numAlumnos + " alumnos");
	
	
	keyboard.close();
}
}

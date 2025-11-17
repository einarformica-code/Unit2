package boletin3.condicionales;

import java.util.Scanner;

public class Ejercicios_Coundcionales4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random1 = (int) (Math.random()*100);
		int random2= (int) (Math.random()*100);
		int sumaInput;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("El primer número es " + random1 + " y el segundo número es " + random2 + ", por favor, indique la suma de ellos.");
		sumaInput = teclado.nextInt();
		
		if(sumaInput == random1 + random2) {
			System.out.println("SUMA CORRECTA");
			
		}else {
			System.out.println(" SUMA INCORRECTA");
		}
		

		
		

	}

}

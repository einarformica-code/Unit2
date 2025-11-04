package tema2.bucles;

import java.util.Scanner;

public class Bucles3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		//inicializamos el contador con valor 0.
		
		int suma = 0;
		//inicializamos la suma, cada vez que se introduzca un número se sumará a los anteriores
		
		System.out.println("Introduzca un número positivo");
		double numero = teclado.nextInt();
		//Pedimos un número
		
		while(numero!=-1) {
			//MIENTRAS QUE EL NÚMERO NO SEA -1
			
			++contador;
			//se incrementa el contador
			
			suma+=numero;
			//se le suma el número a la variable suma.
			
			System.out.println("Introduzca un número positivo");
			 numero = teclado.nextInt();
			 //volvemos a pedir un número y se vuelve a verificar la condición.
			 
			 
			

			
		}//cierre while
		
			if(contador==0) {
				//Si no se ha introducido ningun número distinto a -1..
				
				System.out.println("No se ha introducido ningun número distinto a -1");
			}else {
				double media = suma / (double) contador;
				//la media será de la suma total de los números introducidos entre las ocurrencias de números que haya.
				System.out.println("La media es de " + media);
			}
		
	}

}

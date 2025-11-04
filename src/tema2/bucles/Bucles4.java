package tema2.bucles;

import java.util.Scanner;

public class Bucles4 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int contador=0;
	//Inicializamos a 0 variable donde almacenaremos numero de ocurrencias de numeros introducidos

	
	int contadorZeros=0;
	//Inicializamos a 0 variable donde almacenaremos numero de ocurrencias del 0.
	
	int contadorNegativos=0;
	//Inicializamos a 0 variable donde almacenaremos numero de ocurrencias de números negativos.
	
	int sumaNegativos=0;
	//Inicializamos a 0 variable donde almacenaremos la suma de los números negativos introducidos
	
	int sumaPositivos=0;
	//Inicializamos a 0 variable donde almacenaremos numero de ocurrencias de números positivos.

	
	System.out.println("Introduzca un número");
	int numero = teclado.nextInt();
	++contador;
	while(contador<10) {
		//Mientras que el ocntador no supere 10...
		
		//incrementamos el contador de números introducidos.
		
		if(numero==0) {
			//Si el numero es 0.
			++contadorZeros;
			//incrementamos el contador de 0
			
		}//Primer if
		if (numero>0) {
			//Si el número es positivo
			
			sumaPositivos+=numero;
			//Le sumamos el número al resto de números positivos.
			
		}//Segundo if
		if(numero<0) {
			//Si el número es negativo
			sumaNegativos+=numero;
			//Le sumamos el número al resto de números negativos.

			
			++contadorNegativos;
			//Incrementamos el contador de números negativos
			
			
			
		}//tercer if
		System.out.println("Introduzca un número");
		numero = teclado.nextInt();
		++contador;
		
	}//cierre while
	
	System.out.println("La suma de los números positivos es " +sumaPositivos);
	
	System.out.println("Se han introducido " + contadorZeros + " zeros");
	
	
	if(contadorNegativos==0) {
		//si no se han introducido números negativos...
		System.out.println("No se han introducido números negativos con los que hacer la media");
	}else {
		int mediaNegativosNegativa = sumaNegativos/contadorNegativos;
		//La media será la suma total entre las ocurrencias de números negativos
		int mediaNegativos = -mediaNegativosNegativa;
		//La media real está expresada en valor absoluto, dado que la media calculada siempre será negativa, le cambiamos el signo.
		
		
		System.out.println("La media de números negativos ha sido de " + mediaNegativos);
	}
		
}
}

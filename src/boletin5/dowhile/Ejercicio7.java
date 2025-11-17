package boletin5.dowhile;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		String respuesta;
		//Cadena donde se almacenará la respuesta
		int num1;
		//Entero donde se almacenará primer numero
		int num2;
		//Entero donde se almacenará  segundo numero

		Scanner teclado = new Scanner(System.in);
		//Creamos un Scanner
		do {
			//hacer...
		System.out.println("Introduzca n1");
		num1 = teclado.nextInt();
		//El input del usuario equivaldrá  a n1
		System.out.println("Introduzca n2");
		num2 = teclado.nextInt();
		//El input del usuario equivaldrá  a n2


		System.out.println(
				"Seleccione una opción: a.Sumar los numeros. b.Restar los numeros c.Multiplicar los numeros d.Dividir los numeros");
		respuesta = teclado.next();
		//El valor de "respuesta" será asignado por el input del usuario
		switch (respuesta) {
		//En base al valor de "respuesta"..
		case "a":
		//Si respuesta vale "a"
		int suma = num1 + num2;
		//Realizar suma y almacenar su resultado en la variable suma
		System.out.println(suma);
		//Imprimir suma
		break;
		//NO imprimir el resto de operaciones
		case "b":
		//Si respuesta vale "b"

		int resta = num1-num2;
		//Restarle num2 a num1 y almacenar el resultado en la variabe "resta"
		System.out.println( resta );
		//Imprimir resta
		break;
		//NO realizar el resto de operaciones consecutivas
		case "c":
		//si respuesta vale "c"..
		int multiplicacion= num1*num2;
		//realizar y almacenar la multiplicación en su variable correspondiente
		System.out.println(multiplicacion);
		//Imprimir multiplicación
		break;
		//No realizar las próxims operaciones
		case "d":
		//si respuesta vale "d"
			if (num2==0) {
				//si el segundo número tiene de valor 0
				System.out.println("No se puede dividir entre 0");
			}else {
				//en caso de que num2 sea distinto a 0...
				int division = num1/num2;
				//división equivale a num1 / num2
				System.out.println(division);
				//Imprimir division
			
				
			}
		
		}
		}while(!respuesta.equals("E"));
		//Mientras que la respuesta sea diferente a "E" se realizará el bucle
		System.out.println("Ha salido del programa");
		//Si la respuesta es E, imprimir que se ha salido del bucle.
		teclado.close();
	}

}

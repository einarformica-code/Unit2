package tema2_FOR;

import java.util.Scanner;

public class For6 {
	public static void main(String[] args) {
		//declaramos calificaciones
		int calificacionIntro;
		int contadorCalificacion;
		int suspenso = 0;
		//variable que almacenará el número de INSTANCIAS de calificación
		Scanner teclado = new Scanner(System.in);
		
		for( contadorCalificacion = 0 ; contadorCalificacion <5;contadorCalificacion++) {
			/*/para un contador inicializado en 0, con incremento en uno cada 
			vez y mientras que sea menor que 5../*/
			System.out.print("Introduzca una calificacion");
			calificacionIntro = teclado.nextInt();
			//guardar input del teclado como calificacion
			if (calificacionIntro <5) {
				//si la calificacion es menor a 5
				++suspenso;
				//incrementar el contador de suspensos en 1
			}//cierre if
		}//cierre for
		System.out.println("Hay " + suspenso + " asignaturas suspensas");
	}

}

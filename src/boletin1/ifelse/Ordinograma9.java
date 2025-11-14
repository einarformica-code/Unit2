package boletin1.ifelse;

import java.util.Scanner;

public class Ordinograma9 {
	public static void main(String[] args) {
		int calificacionIntroducida;
		//calificación númerica que se introducirá
		String resultadoCalificación;
		Scanner teclado = new Scanner(System.in);
		/*/Cadena de caracteress que tomará 4 posibles valores 
		dependiendo del valor de la variable introducida/*/
		System.out.println("Introduzca el valor númerico de su calificación");
		calificacionIntroducida = teclado.nextInt();
		
		if(calificacionIntroducida>=0&&calificacionIntroducida<3) {
			//Si la calificaci
			resultadoCalificación = "Muy deficiente";
		
			
		}else if  (calificacionIntroducida>=3&&calificacionIntroducida<5) {
			resultadoCalificación = "Insuficiente";
			
		}else if(calificacionIntroducida>=5&&calificacionIntroducida<7) {
			resultadoCalificación="Bien";
		}else if(calificacionIntroducida>=7&&calificacionIntroducida<9) {
			resultadoCalificación="Notable";
			
		}else if(calificacionIntroducida==10) {
				resultadoCalificación="Sobresaliente";
				}else {
					resultadoCalificación="No se encuentra en el rango definido";}
		System.out.println(resultadoCalificación);
					
	}
	
}

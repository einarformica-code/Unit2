package tema2.ifelse;

import java.util.Scanner;

public class Ud2Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String TIJERA = "TIJERA";
		String PIEDRA = "PIEDRA";
		String PAPEL = "PAPEL";
		String respuestaJ1;
		String respuestaJ2;
		System.out.println("Jugador uno: PIEDRA, PAPEL o TIJERA");
		respuestaJ1 = teclado.next();
		
		System.out.println("Jugador dos: PIEDRA, PAPEL o TIJERA");
		respuestaJ2=teclado.next();
		
		if (respuestaJ1 == respuestaJ2) {
		System.out.println("Empate");
			}else if((respuestaJ1.equals(TIJERA) && respuestaJ2.equals(PAPEL)) 
					|| (respuestaJ1.equals(PIEDRA) && respuestaJ2.equals(TIJERA))
					|| (respuestaJ1.equals(PAPEL) && respuestaJ2.equals(PIEDRA)))
					{System.out.println("Gana Jugador 1");}
				else {System.out.println("Gana Jugador 2");}
		teclado.close();
		
	}

}

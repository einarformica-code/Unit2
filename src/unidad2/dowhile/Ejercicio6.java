package unidad2.dowhile;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	
	String Jugador1;
	//variable donde se almacenará la respuesta del primer jugador
	
	String Jugador2;
	//variable donde se almacenará la respuesta del segundo jugador
	
	do {
		System.out.println("Jugador 1: ¿PIEDRA, PAPEL O TIJERA?");
	Jugador1 = teclado.nextLine();
	//Asignamos el valor que ha tomado la jugada del primer jugador
	}while (!Jugador1.equals("PIEDRA")&&!Jugador1.equals("TIJERA")&&!Jugador1.equals("PAPEL") );
	//mientras que el jugador no equivalga a piedra Y no equivalga a tijera Y no equivalga a PAPEL tampoco se repetirá el bucle
	
	

	do {
		System.out.println("Jugador 2: ¿PIEDRA, PAPEL O TIJERA?");
	Jugador2 = teclado.nextLine();
	//Asignamos el valor que ha tomado la jugada del primer jugador
	}while (!Jugador2.equals("PIEDRA")&&!Jugador2.equals("TIJERA")&&!Jugador2.equals("PAPEL") );
	//mientras que el jugador no equivalga a piedra Y no equivalga a tijera Y no equivalga a PAPEL tampoco se repetirá el bucle
	
	if(Jugador1.equals("PIEDRA") && Jugador2.equals("TIJERA") || Jugador1.equals("PAPEL") && Jugador2.equals("PIEDRA") || Jugador1.equals("TIJERA") && Jugador2.equals("PAPEL") ){
		//Si el jugador 1 es piedra y el 2 es tijera O jugador 1 papel y jugador 2 piedra O jugador 1 tijera y jugador 2 papel
		System.out.println("Gana jugador 1");
		//gana el jugador uno
	}else {
		System.out.println("Gana jugador 2");
		//Si no se cumple ninguna de las instancias donde gana el jugador 1, gana el jugador 2.
	}
	
	
}
}

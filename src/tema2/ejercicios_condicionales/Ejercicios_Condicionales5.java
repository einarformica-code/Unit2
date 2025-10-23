package tema2.ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicios_Condicionales5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		final double precioKm = 2.50;
		double precioInicial;
		double precioFinal;
		int distanciaRecorrer;
		int diasEstancia;
		boolean descuentoSeRealiza;
		
		System.out.println("Cuanta distancia vas a recorrer, en kilómetros");
		distanciaRecorrer = teclado.nextInt();
		precioInicial= distanciaRecorrer * precioKm;
		
		System.out.println("Cuanto tiempo te vas a quedar");
		diasEstancia =teclado.nextInt();
		
		descuentoSeRealiza= distanciaRecorrer > 800 && diasEstancia > 7;
		
		if (descuentoSeRealiza) {
			precioFinal = precioInicial - (precioInicial* 0.3);
		}else {
			precioFinal = precioInicial;
		}
		System.out.println("El precio final es " + precioFinal);
	}

}

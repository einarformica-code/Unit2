package tema2.ifelse;

import java.util.Scanner;

public class Ud2ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double discriminante;
		
		
		System.out.println("Introduzca a");
		a=teclado.nextDouble();
		
		System.out.println("Introduzca b");
		b=teclado.nextDouble();
		
		System.out.println("Introduzca c");
		c=teclado.nextDouble();
		discriminante= b*b - 4*a*c;
		
		if(discriminante<0) {
			System.out.println("NO TIENE SOLUCION");
		}else if(discriminante==0) {
			double solucion = -b/(2*a);
			System.out.println("La única solucion que hay es" + solucion);
		}else {
			double solucion1 = (-b + Math.sqrt(discriminante))/(2*a);
			double solucion2= (-b -Math.sqrt(discriminante))/(2*a);
			System.out.println("La primera solucion es"  + solucion1);
			System.out.println("La segunda solucion es " +solucion2);
		}

		
		

	}

}

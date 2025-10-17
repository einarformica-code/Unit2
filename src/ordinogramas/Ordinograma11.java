package ordinogramas;

import java.util.Scanner;

public class Ordinograma11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double hora;
		double euroHora;
		double salBruto;
		double salNeto;
		double impuesto1 = 0;
		double impuesto2 = 0;

		System.out.println("Horas trabajadas");
		hora = teclado.nextDouble();

		System.out.println("Euros por hora");
		euroHora = teclado.nextDouble();

		if (hora <= 35) {
			salBruto = euroHora * hora;

		} else {
			salBruto = (euroHora * 35) + (euroHora * hora * 1.5);

		}
		
		System.out.println("Su salario bruto es " + salBruto + " euros");
		
		if (salBruto <= 500) {
			salNeto = salBruto;
		} else if (salBruto > 500 && salBruto < 900) {
			impuesto1 = (salBruto - 500) * 0.25;
		} else {
			impuesto1 = 400 * 0.25;
			impuesto2 = (salBruto - 900) * 0.45;
		}
		
		salNeto = salBruto - impuesto1 - impuesto2;
		System.out.println("Su salario neto es " + salNeto + " euros");
		
		teclado.close();
	}

}

package conditionals_english_exercises;

import java.util.Scanner;

public class Conditionals_English_Exercises_1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double basicPrice = 375.99;
		String option;
		double finalPrice;
		
		System.out.println("Do you want a 38cm screen or a 43cm screen");
		option = keyboard.next();
		
		if(option.equals("38cm")) {
			finalPrice = 75.99 + basicPrice;
			System.out.println("The final price is " + finalPrice);
		}else if (option.equals("43cm")) {
			finalPrice= 99.99 + basicPrice;
			System.out.println("The final price is " + finalPrice);
		}else {
			System.out.println(option + " is not equal to 38cm or 43cm");
		}
		;
		keyboard.close();
		
		

	}

}

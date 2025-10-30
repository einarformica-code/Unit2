package conditionals_english_exercises;

import java.util.Scanner;

public class Conditionals_English_Exercises_2 {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	double interestRate;
	double moneyBefore;
	double moneyAfter;
	String option;
	
	System.out.println("Of how much money do you want to calculate the interest rate");
	moneyBefore = keyboard.nextDouble();
	
	
	System.out.println("Specify what type of account you have");
	option = keyboard.next();
	
	switch (option) {
	case "A":
		interestRate=1.5;
		break;
	case "B":
		interestRate=2;
		break;
	case "C":
		interestRate=1.5;
		break;
	case "X":
		interestRate=1.5;
		break;
	default:
		interestRate=0;
		System.out.println("Unrecognized type of account");
	
	}
	moneyAfter = moneyBefore * (interestRate/100);
	System.out.println("Based on your interest rate, " + interestRate + ", you will recieve an extra " + moneyAfter + " dollars this year");
}
}

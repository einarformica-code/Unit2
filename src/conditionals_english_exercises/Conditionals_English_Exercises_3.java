package conditionals_english_exercises;

import java.util.Scanner;

public class Conditionals_English_Exercises_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		int mirrorHour;
		int mirrorMin;
		
		int realHour = 0;
		int realMin = 0;
		
		
		
		System.out.println("Write the hour first (0-12) and the minutes afterwards");
		mirrorHour = keyboard.nextInt();
		mirrorMin = keyboard.nextInt();
		
		
		if (mirrorHour >11) {
			System.out.println("La hora ser mayor que 11, ten en cuenta que 12 será escrito como 00");;
		}else {
			realHour = (mirrorMin == 0) ? (12 - mirrorHour) : (11 - mirrorHour);
		}
		if (mirrorMin>59) {
			System.out.println("Minutos no puede tomar valor mayor que 59");
		}else {
			realMin = (mirrorMin == 0) ? 0 : (60 - mirrorMin);
			
		}
		System.out.println(realHour + ":" +realMin);

		
		 
		
		

	}

}

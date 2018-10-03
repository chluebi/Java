package etutorial1;

import java.util.Arrays;
import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		
		String inputstring = "";
		boolean goodanswer = false;

		double radius = 0;
		double pi = Math.PI;
		
		while (!goodanswer) {
			System.out.println("Was wollen sie berechnen? Möglichkeiten: Kreisfläche, Kreisumfang");
			Scanner input = new Scanner(System.in);
			inputstring = input.next();
			if( Arrays.asList("Kreisfläche","Kreisumfang").contains(inputstring) ) {
				System.out.println(inputstring + " wurde erfolgreich ausgewählt");
				goodanswer = true;
			}
			else {
				System.out.println(inputstring + " ist keine valide Option");
			}
		}
		goodanswer = false;
		while (!goodanswer) {
			System.out.println("Bitte geben sie den Radius des Kreises an.");
			Scanner input = new Scanner(System.in);
			goodanswer = true;
			try {
				radius = input.nextDouble();
			}
			catch (Exception e) {
				System.out.println("Kein valider Radius angegeben");
				goodanswer = false;
			}
			
		}
		System.out.println("Radius auf " + radius + " gesetzt.");
		System.out.println("Bereite Berechnung vor...");
		System.out.println("Zielwert: " + inputstring);
		System.out.println("Radius: " + radius);
		
		
		if (inputstring.equals("Kreisfläche")) {
			double area = 0;
			area = radius * radius * pi;
			System.out.println("Die Fläche eines Kreise mit Radius " + radius + " ist: " + area);
		}
		if (inputstring.equals("Kreisumfang")){
			double circumference = 0;
			circumference = radius * 2 * pi;
			System.out.println("Der Umfang eines Kreise mit Radius " + radius + " ist: " + circumference);
		}
		
		
		
	}

}

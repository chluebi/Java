import java.util.Scanner;

public class Geldautomat {

	public static void main(String[] args) {
		int Eingabe = 0; // Eingaben Variable als Puffer zur besseren Leserlichkeit
		int Rest; // Rest Variable, hat den Restwert des Geldes das noch ausgegeben werden muss
		int Notenanzahl; // Die Anzahl Noten die augegeben werden müssen pro Typ
		boolean goodinput = false; // Kontrollvariable für den while loop, bleibt auf False bis ein akzeptabler Wert angegeben werden
		
		while (!goodinput) {
			System.out.println("Geldautomatibus Maximus! Wieviel möchten Sie abheben?"); // GUI
			Scanner input = new Scanner(System.in);
			goodinput = true;
			try {
				Eingabe = input.nextInt(); // erhalte den Eingabewert
			}
			catch (Exception e) {
				goodinput = false; // halte den Benutzer im while Loop gefangen, bis er/sie lernt nicht dumm zu sein
				// Der Benutzer wird daran erinnert, dass er dumm ist
				System.out.println("Dies ist leider nicht ein valider Wert. Bitte strengen Sie sich mehr an.");
			}
		}
		Rest = Eingabe; // Wir haben noch keine Noten rausgegeben, das bedeutet der Rest ist noch der volle Wert
		
		
		/*
		 * Hier erstellen wir ein Array aller Notenwerte hintereinander
		 * DIE REIHENFOLGE SPIELT EINE ROLLE: ZUERST DIE HOHEN WERTE
		 * 
		 * Warum ein Array?
		 * 	Wir können einfach zusätzliche Werte hinzufügen
		 * 	z.B int[] Noten = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
		 * 
		 * TODO Handling von Rappen
		 */
		int[] Noten = {100, 50, 20, 10, 5, 2, 1};
		
		
		 // In dieser for Schleife gehen wir durch die verschiedenen Notentypen durch
		for(int i=0;i < Noten.length; i++) {
			Notenanzahl = Rest/Noten[i]; // Hier wird die Anzahl Noten, die ausgegeben werden müssen, berechnet
			Rest = Rest%Noten[i]; // Wir müssen den Rest updaten! Sonst werden von jedem darauffolgenden Typ zu viel Noten ausgegeben
			System.out.println(Noten[i] + "er:" + Notenanzahl); // Output TODO schöner machen
		}
	}

}

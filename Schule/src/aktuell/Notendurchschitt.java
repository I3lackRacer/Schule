package aktuell;

import java.util.Scanner;

public class Notendurchschitt {
	
	public Notendurchschitt() {
		
		System.out.println("Schreiben sie die Noten hier drunter. Zum beenden einfach 0.");
		
		Scanner s = new Scanner(System.in);
		
		int lastinput = s.nextInt();
		int Summe = 0;
		int anzahl = 0;
		 while(lastinput != 0){
			lastinput = s.nextInt();
			Summe = Summe + lastinput;
			 anzahl++;
		}
		
		System.out.println("Dein Notendurchschnitt ist: " + Summe/anzahl);
		
	}

}

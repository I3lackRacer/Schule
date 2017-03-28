package aktuell;

import java.util.Random;
import java.util.Scanner;

public class Sortierer {

	public Sortierer() {

		int tmp;
		boolean fertig = false;
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("Anzahl: ");
		int index = s.nextInt();
		System.out.print("Zufall?: ");
		boolean zufall = s.nextBoolean();
		int feld[] = new int[index];
		if (zufall) {
			System.out.print("Bounds?[false/Zahl]: ");
			String boundsstring = s.next();
			if (boundsstring.equalsIgnoreCase("false")) {
				for (int i = 0; i < index; i++) {
					feld[i] = r.nextInt(Integer.MAX_VALUE);
					System.out.println(i + 1 + ". Feld ist " + feld[i]);
				}
			} else {
				try {
					int bounds = Integer.valueOf(boundsstring);
					for (int i = 0; i < index; i++) {
						feld[i] = r.nextInt(bounds+1);
						System.out.println(i + 1 + ". Feld ist " + feld[i]);
					}
				} catch (Exception e) {
					System.out.println("Etwas ist schiefgegangen >.<");
					System.exit(0);
				}
			}
		} else {
			for (int i = 0; i < index; i++) {
				System.out.println(i + 1 + ". Zahl : ");
				feld[i] = s.nextInt();
			}
		}
		int durchgänge = 0;
		int zeile = 1;
		while (!fertig) {
			fertig = true;
			for (int i = 0; i < feld.length - 1; i++) {
				if (feld[i] > feld[i + 1]) {
					fertig = false;
					tmp = feld[i];
					feld[i] = feld[i + 1];
					feld[i + 1] = tmp;
					System.out.println(zeile + ".\t " + "[" + durchgänge + "]" + " Pos:\t " + i + "[" + feld[i] + "]\t\t vertauscht mit \t" + (i+1) + "[" + feld[i+1] + "]");
					zeile++;
					System.out.flush();
				}
			}
			durchgänge++;
		}
		System.out.print(feld[0]);
		String all = String.valueOf(feld[0]);
		for (int i = 0; i < feld.length; i++) {
			System.out.print(", " + feld[i]);
			all = all + ", " + feld[i];
		}
	}

}

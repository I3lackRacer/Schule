package aktuell;

import java.util.Scanner;

public class DreherZähler {

	public DreherZähler() {
		while (true) {
			System.out.print("Satz eingeben: ");
			String satz = new Scanner(System.in).nextLine();
			System.out.print("Satz Rückwärts: ");
			for (int i = satz.length() - 1; i >= 0; i--) {
				System.out.print(satz.charAt(i));
			}
			System.out.println("");
			int anzahl = 0;
			System.out.print("Zeichen: ");
			char tmp = new Scanner(System.in).nextLine().charAt(0);
			for (int i = satz.length() - 1; i >= 0; i--) {
				if (satz.charAt(i) == tmp) {
					anzahl++;
				}
			}
			System.out.println("Das Zeichen kommt " + anzahl + " mal vor" + "\n Weiter?[j/n]");
			if(new Scanner(System.in).nextLine().charAt(0) == 'n') {
				break;
			}
		}
	}
}

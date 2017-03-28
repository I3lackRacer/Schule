package aktuell;

import java.util.Scanner;

public class ForEX {

	public ForEX() {

		Scanner s = new Scanner(System.in);
		System.out.print("Start:    ");
		float start = s.nextFloat();
		System.out.print("Ende:     ");
		float ende = s.nextFloat();
		System.out.print("Schritte: ");
		float schrittweise = s.nextFloat();

		if (schrittweise <= 0) {
			for (float i = start; i >= ende; i += schrittweise) {
				System.out.println(i);
			}
		}else{
			for (float i = start; i <= ende; i += schrittweise) {
				System.out.println(i);
			}
		}
	}

}

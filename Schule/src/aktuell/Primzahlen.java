package aktuell;

import java.util.Scanner;

public class Primzahlen {

	public Primzahlen() {
		System.out.print("Gib eine ganze zahl ein --> ");
		@SuppressWarnings("resource") 
		int zahl = new Scanner(System.in).nextInt();
		int index = 2;
		boolean etwaspasst = false;
		do {
			if (zahl % index == 0) {
				etwaspasst = true;
				System.out.println("Es ist keine");
				break;
			}
			index++;
		}while (index < zahl);
		if(!etwaspasst) {
			System.out.println("Es ist eine");
		}
	}
}
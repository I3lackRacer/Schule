package aktuell;

import java.util.Scanner;

public class CharPrüfer {

	public CharPrüfer() {
		char bst = new Scanner(System.in).next().charAt(0);
		if (bst >= 48 && bst <= 57) {
			System.out.println("Zahl");
		} else {
			if (bst >= 65 && bst <= 90) {
				System.out.println("Großbuchstabe");
			} else {
				if (bst >= 97 && bst <= 122) {
					System.out.println("Kleinbuchstabe");
				} else {
					System.out.println("Sonderzeichen");
				}
			}

		}
	}

}

package aktuell;

import java.util.Scanner;

public class testdual {

	public testdual() {
		
		System.out.print("Gebe eine ganze Zahl ein -->");
		@SuppressWarnings("resource")
		int zahl = new Scanner(System.in).nextInt();

		String dreh = "";
		while (zahl > 0) {
			if (zahl % 2 == 0)
				dreh = dreh + "0";
			else
				dreh = dreh + "1";
			zahl /= 2;
		}

		for (int i = dreh.length() - 1; i >= 0; i--) {
			System.out.print(dreh.charAt(i));
		}
		System.out.println("");
	}
}

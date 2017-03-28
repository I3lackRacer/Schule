package aktuell;

import java.util.Scanner;

public class BMI {

	public BMI() {
		Scanner s = new Scanner(System.in);
		boolean repeat = false;
		do {
			repeat = false;
			System.out.print("Gewicht(KG): ");
			double KG = s.nextInt();
			System.out.print("Groﬂe(CM): ");
			double M = s.nextInt();
			double BMI = KG / ((M / 100) * (M / 100));
			System.out.println("Dein BMI-wert ist " + String.valueOf(Math.floor(BMI * 100) / 100));

			if (BMI <= 25) {
				System.out.println("Normalgewicht");
			} else {
				if (BMI <= 30) {
					System.out.println("‹bergewicht");
				} else {
					if (BMI <= 35) {
						System.out.println("Fett Grad 1");
					} else {
						if (BMI <= 40) {
							System.out.println("Fett Grad 2");
						} else {
							System.out.println("Fett Grad 3");
						}
					}
				}
			}
			System.out.print("Nochmal: ");
			if (s.nextBoolean()) {
				repeat = true;
			}
		} while (repeat);
	}
}

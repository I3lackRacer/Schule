package aktuell;

import java.util.Scanner;

public class Stromverbrauch {

	public Stromverbrauch() {
		Scanner s = new Scanner(System.in);
		System.out.print("Alter Wert: ");
		float alter = s.nextInt();
		System.out.print("Neuer Wert: ");
		float neuer = s.nextInt();
		if (alter > neuer) {
			System.out.println("Alter Wert ist Größer als neuer Wert");
			System.exit(0);
		}
		if (neuer < 0 || alter < 0) {
			System.out.println("Zahlen unter 0 gehen nicht");
			System.exit(0);
		}
		float verbrauch = neuer - alter;
		int tarif = 1;
		if ((verbrauch * 0.185F) + 5 > (verbrauch * 0.155F) + 10) {
			tarif = 2;
		}

		System.out.println("Ihr Verbrauch: " + verbrauch + " KWH");
		System.out.println("Daher wird ihnen der " + tarif + ". Tarif zugeschrieben");
		System.out.print("In diesen Tarif kostet sie jedes KWH ");
		if (tarif == 1) {
			float arbeit = verbrauch*0.185F;
			System.out.println("0.185€");
			System.out.println("Insgesammt währen das " + arbeit + "€");
			System.out.println("Hinzu kommt noch der Grundpreis von 5€");
			arbeit += 5;
			System.out.println("Da kommen sie auf einen Nettopreis von " + arbeit);
		} else {
			float arbeit = verbrauch*0.155F;
			System.out.println("0.155€");
			System.out.println("Insgesammt währen das " + arbeit + "€");
			System.out.println("Hinzu kommt noch der Grundpreis von 10€");
			arbeit += 10;
			System.out.println("Da kommen sie auf einen Nettopreis von " + arbeit);
			arbeit += (arbeit/100)*19;
			System.out.println("Mit den 19% Mehrwertssteuer währe der Endbetrag " + arbeit + "€");
		}
	}
}

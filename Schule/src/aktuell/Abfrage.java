package aktuell;

import java.util.Scanner;

public class Abfrage {
	
	public Abfrage() {
		
		Athlet[] teilnehmer = new Athlet[3];
		
				teilnehmer[0] = new Athlet();
				teilnehmer[1] = new Athlet(teilnehmer[0]);
				
		Scanner sc = new Scanner(System.in);
		System.out.println("(1 = Athlet, 2 = Ski, 3 = Schüler)");
		System.out.print("Abteilung--->");
		int tmpOver = sc.nextInt();
		// Test
		if(tmpOver == 1) {
		
		System.out.print("Name--->               ");
		String tmpName = sc.next();
		
		System.out.print("Weite--->              ");
		float tmpWeite = sc.nextFloat();
		
		System.out.print("Platz--->              ");
		int tmpPlatz = sc.nextInt();
		
		System.out.print("Gedopt--->             ");
		boolean tmpGedopt = sc.nextBoolean();
		
		System.out.print("Sportart(K,W,S,D)--->  ");
		char tmpSportart = sc.next().charAt(0);
		teilnehmer[2] = new Athlet(tmpName, tmpWeite, tmpPlatz, tmpGedopt, 9.95F, tmpSportart);
		teilnehmer[1] = new Athlet(teilnehmer[2]);
		System.out.print("Nr--->                 ");
		int tmpNr = sc.nextInt();
		
		for(Athlet a : teilnehmer) {
			a.allOut();
		}
		
		
		}
		
		if(tmpOver == 2) {
		Ski as;
		Ski ab;
		Ski ac = new Ski();
		
		String tmpHersteller = sc.nextLine();
		System.out.print("Hersteller--->");
		tmpHersteller = sc.nextLine();
		
		System.out.print("Model--->");
		String tmpModel = sc.nextLine();
		
		System.out.print("Länge--->");
		float tmpLänge = sc.nextFloat();
		
		System.out.print("Tage ausgelien--->");
		int tmpTage = sc.nextInt();
		
		System.out.print("Typ(A = anfänger, K = fortgeschritten, K = könner)--->");
		char tmpTyp = sc.next().charAt(0);
		
		System.out.print("Defekt--->");
		boolean tmpDefekt = sc.nextBoolean();
		
		System.out.print("Man?--->");
		boolean tmpMan = sc.nextBoolean();
		
		System.out.print("Fitness(A = Gut,B = Mittel,C = Anfänger)--->");
		char tmpFit = sc.next().charAt(0);
		
		System.out.print("Gewicht--->");
		int tmpgewicht = sc.nextInt();
		
		System.out.print("Könnensstartung(n = newbie, a = Anfänger ,f = fortgeschritten ,m = Mittelmäßig ,p = Profie ,e = Experte)--->");
		char tmpKönnen = sc.next().charAt(0);
		
		as = new Ski(tmpHersteller, tmpModel, tmpLänge, tmpTyp, tmpTage, tmpDefekt, tmpMan, tmpFit, tmpgewicht, tmpKönnen);
		ab = new Ski(ac);
		
		System.out.print("NR--->");
		int tmpNr = sc.nextInt();
		
		switch (tmpNr) {
		case 1:
			as.obtimierung();
			as.allOut();
			break;
		case 2:
			ab.allOut();
			ab.obtimierung();
			break;
		case 3:
			ac.allOut();
			ac.obtimierung();
			break;

		default:
			break;
		}
		}
		
		//Name größe gewicht können
		
		if(tmpOver == 3) {
			Schüler sa;
			Schüler sb;
			Schüler schs = new Schüler();
			
			String tmpName = sc.nextLine();
			System.out.print("Name--->");
			tmpName = sc.nextLine();
			
			System.out.print("Größe--->");
			double tmpGröße = sc.nextFloat();
			
			System.out.print("Gewicht--->");
			int tmpGewicht = sc.nextInt();
		
			System.out.println("(A = Anfänger, F = Fortgeschrittene/r, K = Könner)");
			System.out.print("Können--->");
			char tmpKönnen = sc.next().charAt(0);
			
			sa = new Schüler(tmpName, tmpGröße, tmpGewicht, tmpKönnen);
			sb = new Schüler(sa);
			
			System.out.print("NR--->");
			int tmpNr = sc.nextInt();
			
			switch (tmpNr) {
			case 1:
				sa.allOut();
				break;
			case 2:
				sb.allOut();
				break;
			case 3:
				schs.allOut();
				break;
	
			default:
				break;
			}
		}
	}

}

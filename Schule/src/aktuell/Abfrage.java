package aktuell;

import java.util.Scanner;

public class Abfrage {
	
	public Abfrage() {
		
		Athlet[] teilnehmer = new Athlet[3];
		
				teilnehmer[0] = new Athlet();
				teilnehmer[1] = new Athlet(teilnehmer[0]);
				
		Scanner sc = new Scanner(System.in);
		System.out.println("(1 = Athlet, 2 = Ski, 3 = Sch�ler)");
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
		
		System.out.print("L�nge--->");
		float tmpL�nge = sc.nextFloat();
		
		System.out.print("Tage ausgelien--->");
		int tmpTage = sc.nextInt();
		
		System.out.print("Typ(A = anf�nger, K = fortgeschritten, K = k�nner)--->");
		char tmpTyp = sc.next().charAt(0);
		
		System.out.print("Defekt--->");
		boolean tmpDefekt = sc.nextBoolean();
		
		System.out.print("Man?--->");
		boolean tmpMan = sc.nextBoolean();
		
		System.out.print("Fitness(A = Gut,B = Mittel,C = Anf�nger)--->");
		char tmpFit = sc.next().charAt(0);
		
		System.out.print("Gewicht--->");
		int tmpgewicht = sc.nextInt();
		
		System.out.print("K�nnensstartung(n = newbie, a = Anf�nger ,f = fortgeschritten ,m = Mittelm��ig ,p = Profie ,e = Experte)--->");
		char tmpK�nnen = sc.next().charAt(0);
		
		as = new Ski(tmpHersteller, tmpModel, tmpL�nge, tmpTyp, tmpTage, tmpDefekt, tmpMan, tmpFit, tmpgewicht, tmpK�nnen);
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
		
		//Name gr��e gewicht k�nnen
		
		if(tmpOver == 3) {
			Sch�ler sa;
			Sch�ler sb;
			Sch�ler schs = new Sch�ler();
			
			String tmpName = sc.nextLine();
			System.out.print("Name--->");
			tmpName = sc.nextLine();
			
			System.out.print("Gr��e--->");
			double tmpGr��e = sc.nextFloat();
			
			System.out.print("Gewicht--->");
			int tmpGewicht = sc.nextInt();
		
			System.out.println("(A = Anf�nger, F = Fortgeschrittene/r, K = K�nner)");
			System.out.print("K�nnen--->");
			char tmpK�nnen = sc.next().charAt(0);
			
			sa = new Sch�ler(tmpName, tmpGr��e, tmpGewicht, tmpK�nnen);
			sb = new Sch�ler(sa);
			
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

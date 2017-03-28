package aktuell;

public class Ski {

	public final String Hersteller;
	public final String Model;
	public final double Länge;
	public final char Typ;
	public int tageausgeliehen = 23;
	public static int anzahl = 0;
	public boolean Man;
	public int gewicht;
	public char Fit;
	public char können;
	
	public String getModel() {
		return Model;
	}

	public int getTageausgeliehen() {
		return tageausgeliehen;
	}

	public void setTageausgeliehen(int tageausgeliehen) {
		if (tageausgeliehen <= 10) {
			this.tageausgeliehen = tageausgeliehen;
		}
	}

	public void setDefekt(boolean defekt) {
		this.defekt = defekt;
	}

	public boolean defekt = false;
	public static final float ÄNDERUNG = 0.10F;

	public Ski(Ski ski) {
		this.Hersteller = ski.Hersteller;
		this.Model = ski.Model;
		this.können = ski.können;
		this.Länge = ski.Länge;
		this.Typ = ski.Typ;
		this.tageausgeliehen = ski.tageausgeliehen;
		this.defekt = ski.defekt;
		anzahl++;
	}

	public Ski() {
		this.Hersteller = "Atomic";
		this.Model = "Nomad Blackeye TI 2014/15";
		this.Länge = 2.77;
		this.Typ = 'A';
		this.können = 'a';
		this.tageausgeliehen = 23;
		this.defekt = false;
		this.Fit = 'A';
		this.Man = true;
		this.gewicht = 0;
		anzahl++;
	}

	public Ski(String Hersteller, String Model, double länge, char Typ, int tageausgeliehen, boolean defekt, boolean Man, char Fit, int gewicht, char können) {
		this.können = können;
		this.Hersteller = Hersteller;
		this.Model = Model;
		this.Man = Man;
		this.Fit = Fit;
		this.gewicht = gewicht;
		if(länge > 0) {
		this.Länge = länge;
		}else {
			this.Länge = 0;
			System.out.println("FEHLER! Länge");
		}
		if(Typ == 'A' || Typ == 'F' || Typ == 'K') {
		this.Typ = Typ;
		}else {
			this.Typ = 'A';
			System.out.println("FEHLER! TYP");
		}
		this.tageausgeliehen = tageausgeliehen;
		this.defekt = defekt;
		anzahl++;
	}

	public int obtimierung() {
		
		int Punkte = 0;
		
		if(gewicht < 48) {
			Punkte += 30;
		}
		if(gewicht <= 57 && gewicht > 49) {
			Punkte += 34;
		}
		if(gewicht <= 65 && gewicht > 58) {
			Punkte += 38;
		}
		if(gewicht <= 75 && gewicht > 66) {
			Punkte += 42;
		}
		if(gewicht <= 85 && gewicht > 76) {
			Punkte += 46;
		}
		if(gewicht <= 95 && gewicht > 86) {
			Punkte += 50;
		}
		if(gewicht > 95) {
			Punkte += 54;
		}
		if(Man == true) {
			Punkte += 7;
		}
		if(Fit == 'm') {
			Punkte += 3;
		}
		if(Fit == 's') {
			Punkte += 6;
		}
		if(Fit == 'p') {
			Punkte += 10;
		}
//---------------------------------------------------------------------------------------------
		if(können == 'a') {		//anfänger
			Punkte += 3;
		}
		if(können == 'f') {		//fortgeschritten
			Punkte += 7;
		}
		if(können == 'm') {		//mittelmässig
			Punkte += 12;
		}
		if(können == 'p') {		//Profi
			Punkte += 17;
		}
		if(können == 'e') {		//Experte
			Punkte += 21;
		}
		System.out.println(Punkte +" Punkte");
		return Punkte;
	}

	public String getHersteller() {
		return Hersteller;
	}
	
	public void finalize(Ski ski) {
		System.out.println("REMOVED OBJECT");
	}

	public String getName() {
		return Model;
	}

	public double getLänge() {
		return Länge;
	}

	public char getTyp() {
		return Typ;
	}

	public int getTageAusgeliehen() {
		return tageausgeliehen;
	}

	public void setTageAusgeliehen(int tage) {
		if(tage > 0 && tage <= 20) {
			tageausgeliehen = tage;
		}else {
			System.out.println("FEHLER!");
		}
	}

	public boolean getDefekt() {
		return defekt;
	}

	public void allOut() {
		System.out.println("Hersteller: " + this.Hersteller);
		System.out.println("Model: " + this.Model);
		System.out.println("Länge: " + this.Länge);
		System.out.println("Typ: " + this.Typ);
		System.out.println("defekt: " + this.defekt);
		System.out.println("Tage Ausgeliehen: " + this.tageausgeliehen);
	}
}

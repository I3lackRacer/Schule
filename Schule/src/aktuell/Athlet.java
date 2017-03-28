package aktuell;

public class Athlet {
public String name;
public float weite;
public int Platz;
public boolean gedopt;
public float rekord;
private static final int MAXPLAYER = 32;
public static int anzahlObjekte;
public char sportart;




public static final float WELTREKORD_WEITSPRUNG = 8.95F;
public static final float WELTREKORD_SPEER = 98.95F;
public static final float WELTREKORD_KUGEL = 78.95F;
public static final float WELTREKORD_DISKUS = 66.95F;

	public static int getAnzahlObjekte() {
	return anzahlObjekte;
}

public static void setAnzahlObjekte(int anzahlObjekte) {
	Athlet.anzahlObjekte = anzahlObjekte;
}

	public Athlet(String name, float weite, int Platz, boolean gedopt,float rekord, char sportart) {
		this.sportart = sportart;
		this.name = name;
		this.weite = weite;
		this.Platz = Platz;
		this.gedopt = gedopt;
		this.rekord = rekord;
		Athlet.anzahlObjekte++;
	}
	
	public Athlet() {
		this.name = "Hildegrad";
		this.weite = 8.25F;
		this.Platz = 3;
		this.gedopt = false;
		this.rekord = 7F;
		this.sportart = 'W';
		Athlet.anzahlObjekte++;
	}
	
	public Athlet(Athlet dasOrginal) {
		this.sportart = dasOrginal.sportart;
		this.name = dasOrginal.name;
		this.weite = dasOrginal.weite;
		this.Platz = dasOrginal.Platz;
		this.gedopt = dasOrginal.gedopt;
		Athlet.anzahlObjekte++;
	}
	
	public float biszumweltrekord(float weltrekord) {
		float tmpRekord = 0;
		if(this.getSportart() == 'D' || this.getSportart() == 'd') {
			tmpRekord = WELTREKORD_DISKUS;
		}
		if(this.getSportart() == 'K' || this.getSportart() == 'k') {
			tmpRekord = WELTREKORD_KUGEL;
		}
		if(this.getSportart() == 'W' || this.getSportart() == 'w') {
			tmpRekord = WELTREKORD_WEITSPRUNG;
		}
		if(this.getSportart() == 'S' || this.getSportart() == 's') {
			tmpRekord = WELTREKORD_SPEER;
		}
		float difference = tmpRekord -weite;
		return difference;
		
	}
	
	public void allOut() {
		System.out.println("Athlet Nr. :"+ Athlet.getAnzahlObjekte());
		System.out.println("Name: " + this.name);
		System.out.println("Sportart: " + this.sportart);
		System.out.println("Gesprungene Meter: " + this.weite + "m. Bis zum Weltrekord würde ihm noch:" + biszumweltrekord(this.rekord)+ "m fehlen.");
		System.out.println("Der damit erworbene Platz: " +  this.Platz);
		System.out.println("War er gedopt: " + this.gedopt);
		
		float tmpRekord = 0;
		if(this.getSportart() == 'D') {
			tmpRekord = WELTREKORD_DISKUS;
		}
		if(this.getSportart() == 'K') {
			tmpRekord = WELTREKORD_KUGEL;
		}
		if(this.getSportart() == 'W') {
			tmpRekord = WELTREKORD_WEITSPRUNG;
		}
		if(this.getSportart() == 'S') {
			tmpRekord = WELTREKORD_SPEER;
		}
		
		System.out.println("Momentaner Weltrekord: " + tmpRekord + "m");
	}
	
	public void finalize() {
		anzahlObjekte--;
		System.out.println("Objekt gelöscht!");
	}
	
public String getName() {
	return name;
}

public char getSportart() {
	return sportart;
}

public void setSportart(char sportart) {
	this.sportart = sportart;
}

public void setName(String name) {
	this.name = name;
}

public float getWeite() {
	return weite;
}

public void setWeite(float weite) {
	this.weite = weite;
}

public int getPlatz() {
	return Platz;
}

public void setPlatz(int platz) {
	if(platz >= 1 && platz <= MAXPLAYER ) {
		this.Platz = platz;
	}else{
		System.out.println("Fehler! Der wert muss größer als 0 sein und darf maximal " + MAXPLAYER + " sein.");
	}
}

public boolean isGedopt() {
	return gedopt;
}

public void setGedopt(boolean gedopt) {
	this.gedopt = gedopt;
}

public float getRekord() {
	return rekord;
}

public void setRekord(float rekord) {
	this.rekord = rekord;
}
}

package aktuell;

public class Schüler {
	
	public String Name;
	public double größe;
	public int gewicht;
	public char Können;
	


	public Schüler(Schüler s) {
		this.Name = s.Name;
		this.größe = s.größe;
		this.gewicht = s.gewicht;
		this.Können = s.Können;
	}
	
	public Schüler() {
		this.Name = "Tim Martin Süllner";
		this.größe = 1.80;
		this.gewicht = 70;
		this.Können = 'F';
	}
	
	public Schüler(String name, double größe, int gewicht, char Können) {
		this.Name = name;
		this.größe = größe;
		this.gewicht = gewicht;
		this.Können = Können;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGröße() {
		return größe;
	}

	public void setGröße(double größe) {
		if(größe > 0) {
			this.größe = größe;	
		}
		else{
			System.out.println("FEHLER!");
		}
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public char getKönnen() {
		return Können;
	}

	public void setKönnen(char können) {
		if(können == 'K' || können == 'A' || können == 'F') {
			Können = können;
		}
		else{
			System.out.println("FEHLER!");
		}
	}

	public void allOut() {
		System.out.println("Name: " + this.Name);
		System.out.println("größe: " + this.größe);
		System.out.println("gewicht: " + this.gewicht);
		System.out.println("Können: " + this.Können);
	}
}

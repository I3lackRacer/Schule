package aktuell;

public class Sch�ler {
	
	public String Name;
	public double gr��e;
	public int gewicht;
	public char K�nnen;
	


	public Sch�ler(Sch�ler s) {
		this.Name = s.Name;
		this.gr��e = s.gr��e;
		this.gewicht = s.gewicht;
		this.K�nnen = s.K�nnen;
	}
	
	public Sch�ler() {
		this.Name = "Tim Martin S�llner";
		this.gr��e = 1.80;
		this.gewicht = 70;
		this.K�nnen = 'F';
	}
	
	public Sch�ler(String name, double gr��e, int gewicht, char K�nnen) {
		this.Name = name;
		this.gr��e = gr��e;
		this.gewicht = gewicht;
		this.K�nnen = K�nnen;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGr��e() {
		return gr��e;
	}

	public void setGr��e(double gr��e) {
		if(gr��e > 0) {
			this.gr��e = gr��e;	
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

	public char getK�nnen() {
		return K�nnen;
	}

	public void setK�nnen(char k�nnen) {
		if(k�nnen == 'K' || k�nnen == 'A' || k�nnen == 'F') {
			K�nnen = k�nnen;
		}
		else{
			System.out.println("FEHLER!");
		}
	}

	public void allOut() {
		System.out.println("Name: " + this.Name);
		System.out.println("gr��e: " + this.gr��e);
		System.out.println("gewicht: " + this.gewicht);
		System.out.println("K�nnen: " + this.K�nnen);
	}
}

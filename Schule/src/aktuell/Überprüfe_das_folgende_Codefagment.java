package aktuell;

import extra.Auto;

public class Überprüfe_das_folgende_Codefagment {

	public Überprüfe_das_folgende_Codefagment() {
		Auto[] array = new Auto[3];
		array[0] = new Auto(); //	feld war leer
		array[1] = new Auto(); //	feld war leer
		array[2] = new Auto(); //	feld war leer
		for (int i = 0; i < 3; i++) { // i = 0 und nicht 1, i < 3 und nicht i <= 3
			array[i].tunen(); // Tunen existiert nicht
		}
	}
	
	public void Überprüfe_welche_dieser_Zeilen_gültig_bzw_welche_nicht_gültig_sind() {
		int[] b = {5,10,20}; // das new int[3] kann nur ohne die geschweiften klammern variante verwendet werden
		int a[] = {5,10}; 
		b[0] = 10;  //  die geschweifte klammern variante kann nur während der inizalisierung benutzt werden ansonsten muss man si einzeld überschreiben
		b[1] = 15;	//  die geschweifte klammern variante kann nur während der inizalisierung benutzt werden ansonsten muss man si einzeld überschreiben
		b[2] = 20;	//	die geschweifte klammern variante kann nur während der inizalisierung benutzt werden ansonsten muss man si einzeld überschreiben
		a = new int[3]; 
		String[] d = new String[100]; //Ein [] fehlt
		double[][] e = new double[5][]; 
		double[] f[] = {{10},{50, 20}}; 
	}
}

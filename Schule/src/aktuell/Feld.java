package aktuell;

import java.util.Scanner;

public class Feld {

	public Feld() {
		Scanner s = new Scanner(System.in);
		float all = 0;
		int index;
		
		System.out.print("Indexgröße: "); 
		index = s.nextInt();
		
		float messwert[] = new float[index];

		for (int i = 0; i < index; i++) {
			System.out.print(i + 1 + ". Messwert -----> ");
			messwert[i] = s.nextFloat();
			all += messwert[i];
		}
		all = all / index;

		System.out.println(all);

	}
}

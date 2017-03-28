package aktuell;

import java.util.Random;
import java.util.Scanner;

public class SchlechteVerschlüsslung {

	public SchlechteVerschlüsslung() {
		Scanner s = new Scanner(System.in);
		System.out.print("Nachricht: ");
		char[] msg = s.nextLine().toCharArray();
		int i = 0;
		int key = new Random().nextInt(100);
		for (char c : msg) {
			c = (char) (c ^ key);
			msg[i] = c;
			i++;
		}
		System.out.println(msg);
		System.out.println(key);
	}

}

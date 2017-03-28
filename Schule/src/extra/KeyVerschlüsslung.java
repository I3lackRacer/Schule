package extra;

import java.util.Random;
import java.util.Scanner;

public class KeyVerschlüsslung {

	public KeyVerschlüsslung() {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String key = "";
		System.out.print("Nachricht: ");
		String msg = s.nextLine();
		String verschlüsseltemsg = "";
		for(int i = 0; i < msg.length(); i++) {
			int grad = r.nextInt(9);
			char tmp = (char)(msg.charAt(i) ^ grad);
			verschlüsseltemsg = verschlüsseltemsg + tmp;
			key = key + grad;
		}
		System.out.println(verschlüsseltemsg);
		System.out.println("Entschlüsselungs-Key: " + key);
	}
}

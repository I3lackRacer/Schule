package extra;

import java.util.Random;
import java.util.Scanner;

public class KeyVerschl�sslung {

	public KeyVerschl�sslung() {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String key = "";
		System.out.print("Nachricht: ");
		String msg = s.nextLine();
		String verschl�sseltemsg = "";
		for(int i = 0; i < msg.length(); i++) {
			int grad = r.nextInt(9);
			char tmp = (char)(msg.charAt(i) ^ grad);
			verschl�sseltemsg = verschl�sseltemsg + tmp;
			key = key + grad;
		}
		System.out.println(verschl�sseltemsg);
		System.out.println("Entschl�sselungs-Key: " + key);
	}
}

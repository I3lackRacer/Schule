package extra;

import java.util.Scanner;

public class KeyEntschl�sselung {

	public KeyEntschl�sselung() {
		Scanner s = new Scanner(System.in);
		System.out.print("Verschl�sselte Nachricht: ");
		String verschl�sseltemsg = s.nextLine();
		System.out.print("Key: ");
		String key = s.nextLine();
		String msg = "";
		for(int i = 0; i < verschl�sseltemsg.length(); i++) {
			int tmp = key.charAt(i);
			msg = msg + (char)(verschl�sseltemsg.charAt(i) + (char)(tmp));
		}
		System.out.println(msg);
	}
}
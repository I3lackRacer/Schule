package extra;

import java.util.Scanner;

public class KeyEntschlüsselung {

	public KeyEntschlüsselung() {
		Scanner s = new Scanner(System.in);
		System.out.print("Verschlüsselte Nachricht: ");
		String verschlüsseltemsg = s.nextLine();
		System.out.print("Key: ");
		String key = s.nextLine();
		String msg = "";
		for(int i = 0; i < verschlüsseltemsg.length(); i++) {
			int tmp = key.charAt(i);
			msg = msg + (char)(verschlüsseltemsg.charAt(i) + (char)(tmp));
		}
		System.out.println(msg);
	}
}
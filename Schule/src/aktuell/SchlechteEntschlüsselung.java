package aktuell;

import java.util.Scanner;

public class SchlechteEntschlüsselung {

	public SchlechteEntschlüsselung() {
		Scanner s = new Scanner(System.in);
		System.out.print("Nachricht: ");
		char[] msg = s.nextLine().toCharArray();
		System.out.print("Key: ");
		int key = s.nextInt();
		int i = 0;
		for (char c : msg) {
			c = (char) (c ^ key);
			msg[i] = c;
			i++;
		}
		System.out.println(msg);

	}
}
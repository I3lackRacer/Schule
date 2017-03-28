package aktuell;
import java.util.Scanner;

public class test {

	public test() {
		int geheim = 24;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie ihr passwort ein: ");
		char[] eingabePasswort = sc.nextLine().toCharArray();
		System.out.println("Länge: " + eingabePasswort.length);
		int i = 0;
		for (char c : eingabePasswort) {
			eingabePasswort[i] = (char) (c ^ geheim);
			System.out.println(c + " ^ " + geheim + " = " + eingabePasswort[i]);
			i++;
		}
		System.out.println(eingabePasswort);
	}
}

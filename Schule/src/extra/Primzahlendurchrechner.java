package extra;

import java.util.Scanner;

public class Primzahlendurchrechner {

	public static int anzahl = 0;
	public static int bis = 0;
	public static final long startzeit = System.currentTimeMillis();

	public Primzahlendurchrechner() {
		System.out.print("Bis: ");
		bis = new Scanner(System.in).nextInt();
		int zahl = 3;
		Thread t1 = new tr1();
		Thread t2 = new tr2();
		Thread t3 = new tr3();
		Thread t4 = new tr4();
		Thread t5 = new tr5();
		Thread t6 = new tr6();
		Thread t7 = new tr7();
		Thread t8 = new tr8();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		while (zahl <= bis) {
			int index = 2;
			boolean etwasPasst = false;
			while (index < zahl) {
				if (zahl % index == 0) {
					etwasPasst = true;
					break;
				}
				index++;
			}
			if (!etwasPasst) {
				System.out.println(zahl);
				anzahl++;
			}
			zahl = zahl + 18;
		}
		
		try{
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ingesammt gibt es " + anzahl + " Primzahlen zwischen 0 und " + bis + "("
				+ (System.currentTimeMillis() - startzeit) / 1000 + " Sekunde/n)");
	}
}

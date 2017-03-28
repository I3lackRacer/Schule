package extra;

public class tr3 extends Thread {

	public void run() {
		int bis = Primzahlendurchrechner.bis;
		int zahl = 9;
		while (zahl <= bis) {
			int index = 2;
			boolean etwaspasst = false;
			while (index < zahl) {
				if (zahl % index == 0) {
					etwaspasst = true;
					break;
				}
				index++;
			}
			if (!etwaspasst) {
				System.out.println(zahl + "#");
				Primzahlendurchrechner.anzahl++;
			}
			zahl += 18;
		}
		System.out.println(this.getName() + " ist beendet");
	}

}

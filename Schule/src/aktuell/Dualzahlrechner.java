package aktuell;

import java.util.Scanner;

public class Dualzahlrechner {

  public Dualzahlrechner() {
    System.out.print("Bitte geben sie eine ganze zahl ein -->");
    int zahl = new Scanner(System.in).nextInt();
      System.out.println(Integer.toBinaryString(zahl));
  }

}

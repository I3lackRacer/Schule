package aktuell;

public class Einmaleins{
  
  public Einmaleins() {
    for(int i = 1; i <= 10; i++) {
      for(int e = 1; e <= 10; e++) {
        int ergebins = i^e;
        System.out.print(ergebins + "\t");
      }
          System.out.println("\n \n");
    }                                     
  }
}
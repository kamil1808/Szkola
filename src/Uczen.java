import java.util.*;


public class Uczen extends OsobaWystepujacaWSzkole {
    Uczen() {
        System.out.println(licznik + " Nowo dodany czlowiek, ktory jest " + kimJestem);
    }
    String kimJestem = "uczniem";

    String ktoTo() {
        if (imie.endsWith("a")) {
            kimJestem = "uczennica";
        }
        return kimJestem;
    }
    public  ArrayList<Integer> oceny = new ArrayList<>();
    int numer;
    boolean CzySieUczy;

//metody
   public void UczSie() {
        CzySieUczy = true;
    }
    public void dodajOcene(int ocena) {
        oceny.add(ocena);
    }
}
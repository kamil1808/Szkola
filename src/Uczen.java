import java.util.*;


public class Uczen extends Czlowiek {
    String kimJestem = "uczniem";
    String ktoTo(){
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
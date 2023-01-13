import java.util.*;
import java.util.List;

public class Uczen extends Czlowiek {
    Uczen() {
        //Uczen.dodajOcene(Nauczyciel.ocenSprawdzian());
        ArrayList<Integer> oceny = new ArrayList<Integer>();
    }
    public  ArrayList<Integer> oceny = new ArrayList<Integer>();
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
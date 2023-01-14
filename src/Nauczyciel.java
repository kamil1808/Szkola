import java.lang.Math;
import java.util.ArrayList;

public class Nauczyciel extends Czlowiek {

    String kimJestem = "nauczycielem";
    String ktoTo(){
        if (imie.endsWith("a")) {
            kimJestem = "nauczycielka";
        }
        return kimJestem;
    }
    boolean CzyKogosUczy;

    void uczKogos() {
        CzyKogosUczy = true;
    }

    void ocenSprawdzian(ArrayList<Uczen> klasa) {
       // wez po kolei kazdego ucznia
       klasa.forEach(uczen -> uczen.oceny.add(dajLosowaOcene()));
    }

    int dajLosowaOcene() {
        int nowaocena = (int) (Math.random()*6);

        if (nowaocena < 1) {
            nowaocena = 1;
        }

        return nowaocena;
    }
}

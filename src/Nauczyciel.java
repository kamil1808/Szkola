import java.lang.Math;
import java.util.ArrayList;

public class Nauczyciel extends Czlowiek implements Pedagog {
    Nauczyciel() {
        System.out.println(licznik + " Nowo dodany czlowiek, ktory jest " + kimJestem);
    }

        //interfejsy dodaj, błedy

        public void UczKogos() {
        }
    String kimJestem = "nauczycielem";

    String ktoTo() {
        if (imie.endsWith("a")) {
            kimJestem = "nauczycielka";
        }
        return kimJestem;
    }




    void ocenSprawdzian(ArrayList<Uczen> klasa)  {
        klasa.forEach(uczen -> uczen.oceny.add(dajLosowaOcene()));
    }

    class ZaMalyNumer extends Exception { }
    class ZaDuzyNumer extends Exception { }
    void ocenSprawdzian(ArrayList<Uczen> klasa, int numer) throws ZaMalyNumer, ZaDuzyNumer  {
        numer -= 1;

        try {
            klasa.get(numer).oceny.add(dajLosowaOcene());
        } catch (java.lang.IndexOutOfBoundsException ex) {
            if (numer < 0) {
                throw new ZaMalyNumer();
            } else if (numer > 8) {
                throw new ZaDuzyNumer();
            }

                klasa.get(numer).oceny.add(dajLosowaOcene());

            System.out.println(" ");
        }
    }


    public void ocenSprawdzian(ArrayList<Uczen> klasa, int numer, int ocena) throws ZaMalyNumer, ZaDuzyNumer {
        numer -= 1;
        if (ocena < 1) {
            ocena = 1;
        } else if (ocena > 6) {
            ocena = 6;
        }
        try {
            klasa.get(numer).oceny.add(dajLosowaOcene());
        } catch (java.lang.IndexOutOfBoundsException ex) {
            if (numer < 0) {
                throw new ZaMalyNumer();
            } else if (numer > 8) {
                throw new ZaDuzyNumer();
            }

            klasa.get(numer).oceny.add(dajLosowaOcene());

            System.out.println(" ");
        }
    }

    int dajLosowaOcene() {
        int nowaocena = (int) (Math.random() * 6);

        if (nowaocena < 1) {
            nowaocena = 1;
        }

        return nowaocena;
    }



}



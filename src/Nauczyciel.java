import java.lang.Math;
import java.util.ArrayList;

public class Nauczyciel extends Czlowiek implements Pedagog {
    Nauczyciel() {
        System.out.println(licznik + " Nowo dodany czlowiek, ktory jest " + kimJestem);
    }
        //public enum GronoPedagogiczne { SOBCZAK, DYREKTOR, WFISTA, WEGIEL}
        //interfejsy dodaj, wyliczenia dodaj, switch dodaj

        public void UczKogos() {
        }
    String kimJestem = "nauczycielem";

    String ktoTo() {
        if (imie.endsWith("a")) {
            kimJestem = "nauczycielka";
        }
        return kimJestem;
    }




    void ocenSprawdzian(ArrayList<Uczen> klasa) {
        klasa.forEach(uczen -> uczen.oceny.add(dajLosowaOcene()));
    }


    void ocenSprawdzian(ArrayList<Uczen> klasa, int numer)   {
        numer -= 1;
        try {
            klasa.get(numer).oceny.add(dajLosowaOcene());
        } catch (java.lang.IndexOutOfBoundsException ex) {
            if (numer < 0) {
                System.out.println("Podano za maly numer!!!");
                System.out.println("Losowa ocena dla ucznia o podanym numerze zostala przypisana uczniowi numer 1!!!");
                numer = 0;
            } else if (numer > 8) {
                System.out.println("Podano za duzy numer!!!");
                System.out.println("Losowa ocena dla ucznia o podanym numerze zostala przypisana uczniowi numer 9!!!");
                numer = 8;
            }

            klasa.get(numer).oceny.add(dajLosowaOcene());

            System.out.println(" ");
        }
    }


    public void ocenSprawdzian(ArrayList<Uczen> klasa, int numer, int ocena) {
        numer -= 1;
        if (ocena < 1) {
            ocena = 1;
        } else if (ocena > 6) {
            ocena = 6;
        }

        try {
            klasa.get(numer).oceny.add(ocena);
        } catch (java.lang.IndexOutOfBoundsException ex) {
            numer = 8;
            klasa.get(numer).oceny.add(ocena);
            System.out.println("Podano za duzy numer!!!");
            System.out.println("Wpisana ocena dla ucznia o podanym numerze zostala przypisana uczniowi numer 9!!!");
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



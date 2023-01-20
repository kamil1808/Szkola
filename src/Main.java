import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Witaj w Librus 3C");
        System.out.println(" ");


            Kalendarz.pokazKalendarz();


    System.out.println("Dzis jest: " + Kalendarz.jakiDzisDzien());



        System.out.println(" ");
        ArrayList<Czlowiek> ludzie = new ArrayList<>();
        ArrayList<Uczen> klasa3C;
        klasa3C = utworzliste(9);
        ludzie.addAll(klasa3C);

        Nauczyciel sobi = new Nauczyciel();
        Nauczyciel sabala = new Nauczyciel();
        sobi.imie = "Jacek";
        sobi.nazwisko = "Sobczak";
        sabala.imie = "Grazyna";
        sabala.nazwisko = "Sabalka";
        ludzie.add(sobi);
        ludzie.add(sabala);

        zapoznajLudzi(ludzie);
        System.out.println(" ");

        // ocenianie(<klasa>)  -  losowa ocena dla każdego ucznia
        // ocenianie(<klasa> <numer w dzienniku>)   -  losowa ocena dla konkretnego ucznia ucznia
        // ocenianie(<klasa> <numer w dzienniku> <ocena>)   -  konkretna ocena dla konkretnego ucznia

        sobi.ocenSprawdzian(klasa3C);
        sabala.ocenSprawdzian(klasa3C);
        try {
            sabala.ocenSprawdzian(klasa3C,10);
       } catch (Nauczyciel.ZaMalyNumer zmn) {
            System.out.println("Podano za maly numer!!!");
            System.out.println(" ");
        } catch (Nauczyciel.ZaDuzyNumer zdn) {
            System.out.println("Podano za duzy numer!!!");
            System.out.println(" ");
        }


        try {
            sabala.ocenSprawdzian(klasa3C, 90, 5);
        } catch (Nauczyciel.ZaMalyNumer zmn) {
            System.out.println("Podano za maly numer!!!");
            System.out.println(" ");
        } catch (Nauczyciel.ZaDuzyNumer zdn) {
            System.out.println("Podano za duzy numer!!!");
            System.out.println(" ");
        }

        wypiszliste(klasa3C);
    }

    private static void zapoznajLudzi(ArrayList<Czlowiek> ludzie) {
        System.out.println(" ");
        ludzie.forEach(Czlowiek -> Czlowiek.przedstawsie());

    }

    public static ArrayList<Uczen> utworzliste(int a) {
        if (a > 9) {
            a = 9;
        }
        String[] imiona = new String[a];
        String[] nazwiska = new String[a];
        Uczen[] uczen = new Uczen[a];
        ArrayList<Uczen> uczniowie = new ArrayList();
        for (int y = 0; y < a; y++) {
            //imiona[y] = new String();
            //nazwiska[y] = new String();
            uczen[y] = new Uczen();

            imiona[0] = "Jan";
            imiona[1] = "Jakub";
            imiona[2] = "Ola";
            imiona[3] = "Ania";
            imiona[4] = "Adam";
            imiona[5] = "Olek";
            imiona[6] = "Iza";
            imiona[7] = "Marek";
            imiona[8] = "Monika";
            nazwiska[0] = "Kotry";
            nazwiska[1] = "Owalny";
            nazwiska[2] = "Miskowiec";
            nazwiska[3] = "Gil";
            nazwiska[4] = "Zurek";
            nazwiska[5] = "Taton";
            nazwiska[6] = "Lis";
            nazwiska[7] = "Siwor";
            nazwiska[8] = "Adamowicz";


            uczen[y].imie = imiona[y];
            uczen[y].nazwisko = nazwiska[y];
            uczen[y].numer = y + 1;

            uczniowie.add(uczen[y]);

            if (uczen[y].imie.equals("Ania")  || uczen[y].imie.equals("Monika")) {
                uczen[y].UczSie();
            }
        }
        return uczniowie;
    }


    public static void wypiszliste(ArrayList<Uczen> uczen) {

        for (int i = 0; i < 9; i++) {
            System.out.println("nr." + uczen.get(i).numer + " " + uczen.get(i).imie + " " + uczen.get(i).nazwisko);
            System.out.println("Uczy sie:" + uczen.get(i).CzySieUczy);
            System.out.println("Oceny: " + uczen.get(i).oceny);
            System.out.println(" ");
        }
    }
}




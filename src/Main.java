import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Witaj w Librus 3C");
        System.out.println(" ");
        //utworzliste(9);
        ArrayList<Uczen> klasa3C = new ArrayList<>();
        klasa3C = utworzliste(9);
        ArrayList<Czlowiek> ludzie = new ArrayList<>();
        //ludzie.addAll(klasa3C);
        Nauczyciel sobi = new Nauczyciel();
        //ludzie.add(sobi);
        //zapoznajLudzi(ludzie);
        sobi.ocenSprawdzian(klasa3C);
        wypiszliste(klasa3C);
    }

    private static void zapoznajLudzi(ArrayList<Czlowiek> ludzie) {
        //na kazdym z listy wywolac przedtaw sie

        //jestem nauczycielem i nazywam sie
        //jestem uczniem i nazywam sie
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
            imiona[y] = new String();
            nazwiska[y] = new String();
            uczen[y] = new Uczen();
            //ArrayList<Integer> oceny = new ArrayList<>();
            //ocena[] [y] = new Oceny();
            imiona[0] = "Jan";
            imiona[1] = "Kuba";
            imiona[2] = "Ola";
            imiona[3] = "Ania";
            imiona[4] = "Adam";
            imiona[5] = "Olek";
            imiona[6] = "Iza";
            imiona[7] = "Marek";
            imiona[8] = "Ewa";
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

            if (uczen[y].imie == "Ania" || uczen[y].imie == "Ewa") {
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




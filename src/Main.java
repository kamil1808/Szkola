public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Witaj w Librus 3C");
        System.out.println(" ");

        //klasa składa się z 9 uczniów
        // a określa ilu uczniów chcesz wyświetlić (max 9)
        utworzliste(22);
        //wypiszliste();
    }

    public static void utworzliste(int a) {
        if (a > 9) {
            a = 9;
        }
        String[] imiona = new String[9];
        String[] nazwiska = new String[9];
        for (int y = 0; y < a; y++) {
            imiona[y] = new String();
            nazwiska[y] = new String();
            imiona[0] = "Jan";
            nazwiska[0] = "Kotry";

            imiona[1] = "Kuba";
            nazwiska[1] = "Owalny";

            imiona[2] = "Ola";
            nazwiska[2] = "Miskowiec";

            imiona[3] = "Ania";
            nazwiska[3] = "Gil";

            imiona[4] = "Adam";
            nazwiska[4] = "Zurek";

            imiona[5] = "Olek";
            nazwiska[5] = "Taton";

            imiona[6] = "Iza";
            nazwiska[6] = "Lis";

            imiona[7] = "Marek";
            nazwiska[7] = "Siwor";

            imiona[8] = "Ewa";
            nazwiska[8] = "Adamowicz";
        }

        //wypiszliste();

        Uczen[] uczen = new Uczen[a];
        for (int i = 0; i < a; i++) {
            uczen[i] = new Uczen();
            uczen[i].imie = imiona[i];
            uczen[i].nazwisko = nazwiska[i];
            //uczen[i].oceny = ocenyyy[i];
            uczen[i].numer = i + 1;
            if (uczen[i].imie == "Ania" || uczen[i].imie == "Ewa") {
                uczen[i].UczSie();
            }

            System.out.println("nr." + uczen[i].numer + " " + uczen[i].imie + " " + uczen[i].nazwisko + " Uczy sie:" + uczen[i].CzySieUczy);
        }
    }
}



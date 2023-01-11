public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Witaj w Librus 3C");
        System.out.println(" ");

        // klasa składa się z 9 uczniów
        // a określa ilu uczniów chcesz wyświetlić (max 9)
        //utworzliste(9);
        //Arraylist<uczen> uczen[] lista1 =

        wypiszliste(utworzliste(9));
    }

    public static Uczen[] utworzliste(int a) {
        if (a > 9) {
            a = 9;
        }
        String[] imiona = new String[9];
        String[] nazwiska = new String[9];
        Uczen[] uczen = new Uczen[9];
        for (int y = 0; y < a; y++) {
            imiona[y] = new String();
            nazwiska[y] = new String();
            uczen[y] = new Uczen();
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

                //uczen[i].oceny = ocenyyy[i];
                uczen[y].numer = y + 1;
                if (uczen[y].imie == "Ania" || uczen[y].imie == "Ewa") {
                    uczen[y].UczSie();
                }
        }
        return uczen;
    }


        public static void wypiszliste(Uczen [] uczen) {

            for (int i = 0; i < 9; i++) {
            System.out.println("nr." + uczen[i].numer + " " + uczen[i].imie + " " + uczen[i].nazwisko + " Uczy sie:" + uczen[i].CzySieUczy);
        }
            }
    }



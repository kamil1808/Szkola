public class Main {

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Witaj w Librus 3C");
        System.out.println(" ");

        //klasa składa się z 9 uczniów
        // a określa ilu uczniów chcesz wyświetlić (max 9)
        utworzliste1(9);
        utworzliste2(9);
        wypiszliste(utworzliste1(9), utworzliste2(9));

    }

    public static String[] utworzliste1(int a) {
        if (a > 9) {
            a = 9;
        }
        String[] imiona = new String[9];

        for (int y = 0; y < a; y++) {
            imiona[y] = new String();

            imiona[0] = "Jan";
            imiona[1] = "Kuba";
            imiona[2] = "Ola";
            imiona[3] = "Ania";
            imiona[4] = "Adam";
            imiona[5] = "Olek";
            imiona[6] = "Iza";
            imiona[7] = "Marek";
            imiona[8] = "Ewa";
        }
        return imiona;
    }
    public static String[] utworzliste2(int a) {
        if (a > 9) {
            a = 9;
        }
        String[] nazwiska = new String[9];
        for (int y = 0; y < a; y++) {
            nazwiska[y] = new String();

            nazwiska[0] = "Kotry";
            nazwiska[1] = "Owalny";
            nazwiska[2] = "Miskowiec";
            nazwiska[3] = "Gil";
            nazwiska[4] = "Zurek";
            nazwiska[5] = "Taton";
            nazwiska[6] = "Lis";
            nazwiska[7] = "Siwor";
            nazwiska[8] = "Adamowicz";
        }
        return nazwiska;
    }




        public static void wypiszliste(String [] imiona, String [] nazwiska) {
        
            Uczen[] uczen = new Uczen[9];
            for (int i = 0; i < 9; i++) {
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



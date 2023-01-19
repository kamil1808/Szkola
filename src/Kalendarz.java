import java.util.Calendar;

public class Kalendarz {
    public static void pokazKalendarz() {
        Calendar kalendarz = Calendar.getInstance();
        Calendar koniecroku = Calendar.getInstance();
        koniecroku.set(2023, 5, 23);
        long dzis = kalendarz.getTimeInMillis();
        long koniec = koniecroku.getTimeInMillis();
        long ilezostalodni = (long) (koniec - dzis) / (1000 * 24 * 60 * 60);
        System.out.println("Dzisiejsza data to: " + String.format("%td %<tB", kalendarz));
        System.out.println("Godzina: " + String.format("%tr", kalendarz));
        System.out.println(" ");
        System.out.println("Do konca roku szkolnego pozostalo: " + ilezostalodni + " Dni");
        System.out.println(" ");
    }
    enum Dzientygodnia {PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK, SOBOTA, NIEDZIELA}
    Dzientygodnia dzientygodnia;
    public static String jakiDzisDzien() {
        String dzientygodnia = "NIE UDALO SIE OKRESLIC DNIA";
        Calendar kalendarz = Calendar.getInstance();
        enum Dzientygodnia {PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK, SOBOTA, NIEDZIELA}
        //Dzientygodnia dzientygodnia = Dzientygodnia.CZWARTEK;
        switch (kalendarz.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> dzientygodnia = "NIEDZIELA";
            case 2 -> dzientygodnia = "PONIEDZIALEK";
            case 3 -> dzientygodnia = "WTOREK";
            case 4 -> dzientygodnia = "SRODA";
            case 5 -> dzientygodnia = "CZWARTEK";
            case 6 -> dzientygodnia = "PIATEK";
            case 7 -> dzientygodnia = "SOBOTA";
        }
        return dzientygodnia;
    }
}


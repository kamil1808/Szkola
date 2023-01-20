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
    enum Dzientygodnia {BLAD_METODY,PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK, SOBOTA, NIEDZIELA}
    public static Dzientygodnia jakiDzisDzien() {
        Calendar kalendarz = Calendar.getInstance();
        Dzientygodnia dzientygodnia = Dzientygodnia.BLAD_METODY;

        switch (kalendarz.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> dzientygodnia = Dzientygodnia.NIEDZIELA;
            case 2 -> dzientygodnia = Dzientygodnia.PONIEDZIALEK;
            case 3 -> dzientygodnia = Dzientygodnia.WTOREK;
            case 4 -> dzientygodnia = Dzientygodnia.SRODA;
            case 5 -> dzientygodnia = Dzientygodnia.CZWARTEK;
            case 6 -> dzientygodnia = Dzientygodnia.PIATEK;
            case 7 -> dzientygodnia = Dzientygodnia.SOBOTA;
        }
        return dzientygodnia;
    }
}


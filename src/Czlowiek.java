import java.util.ArrayList;

public class Czlowiek  {
    Czlowiek() {
        licznik ++;
    }
    static int licznik = 0;

    String imie;
    String nazwisko;
    String kimJestem;


    String ktoTo()  {
        return kimJestem;
    }
    public void przedstawsie()  {

            System.out.println("Jestem " + ktoTo() + " i nazywam sie " + imie + " " + nazwisko);


        }
    }


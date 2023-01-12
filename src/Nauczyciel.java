import java.lang.Math;
public class Nauczyciel extends Czlowiek {
    String stanowisko;
    boolean CzyKogosUczy;

    void uczKogos() {
        CzyKogosUczy = true;
    }
    int ocenSprawdzian () {

        int nowaocena = (int) (Math.random()*6);

        if (nowaocena < 0) {
            nowaocena = 1;
        } else if (nowaocena > 6) {
            nowaocena = 6;
        }

        return nowaocena;
    }
}

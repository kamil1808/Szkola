public class Czlowiek  {
    String imie;
    String nazwisko;
    String kimJestem;
    String ktoTo(){
        return kimJestem;
    }
    void przedstawsie() {
       System.out.println("Jestem " + ktoTo() + " i nazywam sie " + imie + " " + nazwisko);
   }
}

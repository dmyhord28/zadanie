public class Pracownik {

    private String imie;
    private double pensja;

    public Pracownik(String imie, double pensja) {
        this.imie = imie;
        this.pensja = pensja;
    }

    public Pracownik(String imie) {
        this(imie, 3000.0);
    }

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jan", 4500.0);
        Pracownik pracownik2 = new Pracownik("Anna");

        System.out.println(pracownik1.imie + " zarabia " + pracownik1.pensja);
        System.out.println(pracownik2.imie + " zarabia " + pracownik2.pensja);
    }
}